package com.medikm.input.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medikm.input.dao.BiopsyTypeDao;
import com.medikm.input.dao.CancerSubTypeDao;
import com.medikm.input.dao.CancerTypeDao;
import com.medikm.input.dao.FunctionalStatusDao;
import com.medikm.input.dao.ImagingStatusDao;
import com.medikm.input.dao.PhysicianDao;
import com.medikm.input.dao.RaceDao;
import com.medikm.input.dao.ReasonForPresentationDao;
import com.medikm.input.dao.TreatmentDao;
import com.medikm.input.dao.UserDao;
import com.medikm.input.entity.BiopsyType;
import com.medikm.input.entity.CancerSubType;
import com.medikm.input.entity.CancerType;
import com.medikm.input.entity.Functionalstatus;
import com.medikm.input.entity.Physician;
import com.medikm.input.entity.PropertiesType;
import com.medikm.input.entity.Race;
import com.medikm.input.entity.ReasonForPresentation;
import com.medikm.input.entity.SurgeryType;
import com.medikm.input.entity.User;
import com.medikm.input.entity.UserPropertiesInfo;
import com.medikm.input.entity.WorkupKindType;
import com.medikm.input.request.BiopsyTypeRequest;
import com.medikm.input.request.CancerSubTypeRequest;
import com.medikm.input.request.CancerTypeRequest;
import com.medikm.input.request.FunctionalStatusRequest;
import com.medikm.input.request.ImagingStatusRequest;
import com.medikm.input.request.PhysicianRequest;
import com.medikm.input.request.ReasonForPresentationRequest;
import com.medikm.input.request.TreatmentRequest;
import com.medikm.input.response.BiopsyTypeResponse;
import com.medikm.input.response.CancerSubTypeResponse;
import com.medikm.input.response.CancerTypeResponse;
import com.medikm.input.response.FunctionalStatusResponse;
import com.medikm.input.response.ImagingStatusResponse;
import com.medikm.input.response.MedikmResponse;
import com.medikm.input.response.PhysicianResponse;
import com.medikm.input.response.ReasonForPresentationResponse;
import com.medikm.input.response.TreatmentResponse;
import com.medikm.input.service.MasterTableService;
import com.medikm.input.util.AuthenticationService;
import com.medikm.input.util.MedikmConstants;
/**
 * Author : Dhiraj Singh 
 */

@Service("MasterTableService")
public class MasterTableServiceImpl implements MasterTableService{
	
	private Logger log = Logger.getLogger(MasterTableServiceImpl.class);
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	RaceDao raceDao;
	@Autowired
	PhysicianDao physicianDao;
	@Autowired
	CancerTypeDao cancerTypeDao;
	@Autowired
	CancerSubTypeDao cancerSubTypeDao;
	@Autowired
	FunctionalStatusDao functionalStatusDao;
	@Autowired
	ImagingStatusDao imagingStatusDao;
	@Autowired
	BiopsyTypeDao biopsyTypeDao;
	@Autowired
	ReasonForPresentationDao reasonForPresentationDao;
	@Autowired
	TreatmentDao treatmentDao;
	@Autowired
	UserDao  userDao;
	@Autowired
	private AuthenticationService authenticationService;
	
	@Override
	public MedikmResponse addRace(String raceName, String ipAddress) {
		MedikmResponse r= new MedikmResponse();
		 Race race=new Race();
		 race.setRace(raceName);
		 raceDao.saveOrUpdate(race);
		 return r;
	}

	@Override
	@Transactional
	public PhysicianResponse addPhysician(PhysicianRequest physician, String ipAddress) {
		PhysicianResponse response = new PhysicianResponse();
		try {
			if (authenticationService.authenticateAuthToken(physician.getAuthToken(), ipAddress)) {
    		Physician isPhysicianExist=physicianDao.getPhysicanByEmailId(physician.geteMailId());
    		if(isPhysicianExist!=null){
    			log.error("Email-Id already exist");
    			response.setResponseCode(MedikmConstants.USER_EXIST_RESPONSE_CODE);
    			response.setResponseMessage(MedikmConstants.PHYSICIAN_EXIST_RESPONSE_MESSAGE);
    			response.setPhysicianId(0);
    			return response;
    		}
    		if(physician.getCreateUserAccountCheck().equals("YES")){
    			User isUserExist=userDao.getUserByUsername(physician.getUserName());
    			if(isUserExist==null){
					Physician p=new Physician();
					BeanUtils.copyProperties(p, physician);
					p.setEMailId(physician.geteMailId());
					p.setProfileImage(physician.getProfileImage());
					p.setCancerTypeId(physicianDao.getCancerTypeById(physician.getCancerType()));
					p.setFacilityId(physicianDao.getFacilityTypeById(physician.getFacilityTypeId()));
					p.setSpecialty(physicianDao.getPhysicianSpecialityById(physician.getSpecialtyTypeId()));
					p.setDiseaseTypeId(physicianDao.getDiseaseTypeById(physician.getDiseaseType()));
					Integer physicianId = physicianDao.insertPhysician(p);
				    if(physicianId!=null){
			    	 	User user = new User();
			    	 	user.setPhysicianId(physicianId);
			    	 	user.setUserName(physician.getUserName());
			    	 	/*user.setPassword(physician.getPassword());*/
			    	 	user.setPriority(Short.valueOf("1"));
			    	 	user.setDiseaseTypeId(p.getDiseaseTypeId());
			    	 	user.setCustomerId(userDao.getCustomerId());
			    	 	user.setRoleCode(physician.getRoleCode());
			    	 	user.setAuthToken(physician.getAuthToken());
			    	 	user.setIsActive(true);
			    	 	user.setCreate_user_date(new Date());
			    	 	Integer userId = userDao.insertUser(user);
			    	 	List<UserPropertiesInfo> propertiesInfoList=new ArrayList<UserPropertiesInfo>();
			    	 	UserPropertiesInfo userPropertiesInfo = new UserPropertiesInfo();
			    	 	userPropertiesInfo.setUserId(userDao.getUser(userId));
			    	 	userPropertiesInfo.setPropertiestypeId(userDao.getUserPropertyTypeId(physician.getDiseaseType()));
			    	 	propertiesInfoList.add(userPropertiesInfo);
			    	 	//----------------- Assign rights to mail notification ----------------------
			    	 	userPropertiesInfo = new UserPropertiesInfo();
			    	 	userPropertiesInfo.setUserId(userDao.getUser(userId));
			    	 	userPropertiesInfo.setPropertiestypeId(new PropertiesType(10));
			    	 	propertiesInfoList.add(userPropertiesInfo);
			    	 	//----------------- End  -------------------------------------------------
			    	 	//----------------- Assign rights to System Setting ----------------------
			    	 	if(physician.getRoleCode().equals("SYSTEM_ADMIN")||physician.getRoleCode().equals("DATA_ADMIN")){
			    	 		userPropertiesInfo = new UserPropertiesInfo();
			    	 		userPropertiesInfo.setUserId(userDao.getUser(userId));
			    	 		userPropertiesInfo.setPropertiestypeId(new PropertiesType(9));// 9 for SYSTEM_SETTING
			    	 		propertiesInfoList.add(userPropertiesInfo);
			    	 	}
				    	 	//----------------- End  -------------------------------------------------
			    	 	userDao.updateAllUserPropertiesInfo(propertiesInfoList);
				    }
				    response.setPhysicianId(physicianId);
				    response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
					response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
	    		}else{
	    			log.error(" Username already exist");
	    			response.setResponseCode(MedikmConstants.USER_EXIST_RESPONSE_CODE);
	    			response.setResponseMessage("Username already exist.");
	    			response.setPhysicianId(0);
	    		}
		    
	    	}else if(physician.getCreateUserAccountCheck().equals("NO")){
	   			Physician p=new Physician();
	   			BeanUtils.copyProperties(p, physician);
	   			p.setEMailId(physician.geteMailId());
	   			p.setProfileImage(physician.getProfileImage());
	   			p.setCancerTypeId(physicianDao.getCancerTypeById(physician.getCancerType()));
	   			p.setFacilityId(physicianDao.getFacilityTypeById(physician.getFacilityTypeId()));
	   			p.setSpecialty(physicianDao.getPhysicianSpecialityById(physician.getSpecialtyTypeId()));
	   			p.setDiseaseTypeId(physicianDao.getDiseaseTypeById(physician.getDiseaseType()));
	   			Integer physicianId = physicianDao.insertPhysician(p);
	   			response.setPhysicianId(physicianId);
	   			response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
	   			response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
	   		}		
		}else {
			log.error("Authentication Failed");
			response.setAuthenticationKey("");
			response.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	}catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in addPhysician Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
			response.setPhysicianId(0);
		}
		log.info("In Physician Service :: Inserting Physician End");
		return response;
	}

	@Override
	@Transactional
	public PhysicianResponse editPhysician(PhysicianRequest physician, String ipAddress) {
		log.info("In Physician Service :: Editing Physician Start");
		PhysicianResponse response = new PhysicianResponse();
		try {
			if (authenticationService.authenticateAuthToken(physician.getAuthToken(), ipAddress)) {
			  Physician p = physicianDao.getPhysicanById(physician.getPhysicianId());
			  if(!p.getEMailId().equals(physician.geteMailId())){
		    		Physician isPhysicianExist=physicianDao.getPhysicanByEmailId(physician.geteMailId());
		    		if(isPhysicianExist!=null){
		    			log.error("Email-Id already exist");
		    			response.setResponseCode(MedikmConstants.USER_EXIST_RESPONSE_CODE);
		    			response.setResponseMessage(MedikmConstants.PHYSICIAN_EXIST_RESPONSE_MESSAGE);
		    			response.setPhysicianId(0);
		    			return response;
		    		}
			  }
			  if(physician.getCreateUserAccountCheck().equals("NO")){
				  BeanUtils.copyProperties(p, physician);
				  p.setEMailId(physician.geteMailId());
				  p.setProfileImage(physician.getProfileImage());
				  p.setCancerTypeId(physicianDao.getCancerTypeById(physician.getCancerType()));
				  p.setFacilityId(physicianDao.getFacilityTypeById(physician.getFacilityTypeId()));
				  p.setSpecialty(physicianDao.getPhysicianSpecialityById(physician.getSpecialtyTypeId()));
				  p.setDiseaseTypeId(physicianDao.getDiseaseTypeById(physician.getDiseaseType()));
				  physicianDao.updatePhysician(p);
				  User user = userDao.getUserByPhycisianID(p.getPhysicianId());
				  if(user!=null){ 
					  	  //When account exist for physician
						  if(user.getUserName().equals(physician.getUserName())){
							    user.setUserName(physician.getUserName());
								/*user.setPassword(physician.getPassword());*/
					    	 	user.setPriority(Short.valueOf("1"));
					    	 	user.setDiseaseTypeId(p.getDiseaseTypeId());
					    	 	user.setCustomerId(userDao.getCustomerId());
					    	 	user.setRoleCode(physician.getRoleCode());
					    	 	user.setAuthToken(physician.getAuthToken());
					    	 	//user.setIsActive(physician.getIsActive());
					    	 	user.setCreate_user_date(new Date());
					    	 	userDao.updateUser(user);
					    	 	List<UserPropertiesInfo> UserPropertiesInfoList=userDao.getUserPropertiesInfoListByUserId(user.getLoginId());
					    	 	userDao.removeUserPropertiesInfoListbyUserId(UserPropertiesInfoList);
					    	 	List<UserPropertiesInfo> propertiesInfoList=new ArrayList<UserPropertiesInfo>();
					    	 	UserPropertiesInfo userPropertiesInfo = new UserPropertiesInfo();
					    	 	userPropertiesInfo.setUserId(userDao.getUser(user.getLoginId()));
					    	 	userPropertiesInfo.setPropertiestypeId(userDao.getUserPropertyTypeId(physician.getDiseaseType()));
					    	 	propertiesInfoList.add(userPropertiesInfo);
					    	 	//----------------- Assign rights to mail notification ----------------------
					    	 	userPropertiesInfo = new UserPropertiesInfo();
					    	 	userPropertiesInfo.setUserId(userDao.getUser(user.getLoginId()));
					    	 	userPropertiesInfo.setPropertiestypeId(new PropertiesType(10));
					    	 	propertiesInfoList.add(userPropertiesInfo);
					    	 	//----------------- End  -------------------------------------------------
					    	 	//----------------- Assign rights to System Setting ----------------------
					    	 	if(physician.getRoleCode().equals("SYSTEM_ADMIN")||physician.getRoleCode().equals("DATA_ADMIN")){
					    	 		userPropertiesInfo = new UserPropertiesInfo();
					    	 		userPropertiesInfo.setUserId(userDao.getUser(user.getLoginId()));
					    	 		userPropertiesInfo.setPropertiestypeId(new PropertiesType(9));// 9 for SYSTEM_SETTING
					    	 		propertiesInfoList.add(userPropertiesInfo);
					    	 	}
					    	 	//----------------- End  -------------------------------------------------
					    	 	userDao.updateAllUserPropertiesInfo(propertiesInfoList);
					    	 	response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
								response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
					    	    
						   }else{
							   User isUserExist = userDao.getUserByUsername(physician.getUserName());
							   if(isUserExist==null){
								   	user.setUserName(physician.getUserName());
									/*user.setPassword(physician.getPassword());*/
						    	 	user.setPriority(Short.valueOf("1"));
						    	 	user.setDiseaseTypeId(p.getDiseaseTypeId());
						    	 	user.setCustomerId(userDao.getCustomerId());
						    	 	user.setRoleCode(physician.getRoleCode());
						    	 	user.setAuthToken(physician.getAuthToken());
						    	 	//user.setIsActive(physician.getIsActive());
						    	 	user.setCreate_user_date(new Date());
						    	 	userDao.updateUser(user);
						    	 	List<UserPropertiesInfo> UserPropertiesInfoList=userDao.getUserPropertiesInfoListByUserId(user.getLoginId());
						    	 	userDao.removeUserPropertiesInfoListbyUserId(UserPropertiesInfoList);
						    	 	List<UserPropertiesInfo> propertiesInfoList=new ArrayList<UserPropertiesInfo>();
						    	 	UserPropertiesInfo userPropertiesInfo = new UserPropertiesInfo();
						    	 	userPropertiesInfo.setUserId(userDao.getUser(user.getLoginId()));
						    	 	userPropertiesInfo.setPropertiestypeId(userDao.getUserPropertyTypeId(physician.getDiseaseType()));
						    	 	propertiesInfoList.add(userPropertiesInfo);
						    	 	//----------------- Assign rights to mail notification ----------------------
						    	 	userPropertiesInfo = new UserPropertiesInfo();
						    	 	userPropertiesInfo.setUserId(userDao.getUser(user.getLoginId()));
						    	 	userPropertiesInfo.setPropertiestypeId(new PropertiesType(10));
						    	 	propertiesInfoList.add(userPropertiesInfo);
						    	 	//----------------- End  -------------------------------------------------
						    	    //----------------- Assign rights to System Setting ----------------------
						    	 	if(physician.getRoleCode().equals("SYSTEM_ADMIN")||physician.getRoleCode().equals("DATA_ADMIN")){
						    	 		userPropertiesInfo = new UserPropertiesInfo();
						    	 		userPropertiesInfo.setUserId(userDao.getUser(user.getLoginId()));
						    	 		userPropertiesInfo.setPropertiestypeId(new PropertiesType(9));// 9 for SYSTEM_SETTING
						    	 		propertiesInfoList.add(userPropertiesInfo);
						    	 	}
						    	 	//----------------- End  ------------------------------------------------- 
						    	 	userDao.updateAllUserPropertiesInfo(propertiesInfoList);
						    	 	response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
									response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
							   }else{
								   log.error(" Username already exist");
								   response.setResponseCode(MedikmConstants.USER_EXIST_RESPONSE_CODE);
								   response.setResponseMessage("Username already exist.");
								   response.setPhysicianId(0);
							   }
							   
						   }
					}else{
						// Neither user account exist nor want to create 
						 response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
						 response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
					}
			  }else if(physician.getCreateUserAccountCheck().equals("YES")){
				  User isUserExist=userDao.getUserByUsername(physician.getUserName());
				  if(isUserExist==null){
					  BeanUtils.copyProperties(p, physician);
					  p.setEMailId(physician.geteMailId());
					  p.setProfileImage(physician.getProfileImage());
					  p.setCancerTypeId(physicianDao.getCancerTypeById(physician.getCancerType()));
					  p.setFacilityId(physicianDao.getFacilityTypeById(physician.getFacilityTypeId()));
					  p.setSpecialty(physicianDao.getPhysicianSpecialityById(physician.getSpecialtyTypeId()));
					  p.setDiseaseTypeId(physicianDao.getDiseaseTypeById(physician.getDiseaseType()));
					  physicianDao.updatePhysician(p);
					  if(p.getPhysicianId()!=null){
						  	User user = new User();
						   	user.setUserName(physician.getUserName());
							/*user.setPassword(physician.getPassword());*/
				    	 	user.setPhysicianId(p.getPhysicianId());
				    	 	user.setPriority(Short.valueOf("1"));
				    	 	user.setDiseaseTypeId(p.getDiseaseTypeId());
				    	 	user.setCustomerId(userDao.getCustomerId());
				    	 	user.setRoleCode(physician.getRoleCode());
				    	 	user.setAuthToken(physician.getAuthToken());
				    	 	user.setIsActive(true);
				    	 	user.setCreate_user_date(new Date());
				    	 	Integer userId = userDao.insertUser(user);
				    	 	List<UserPropertiesInfo> propertiesInfoList=new ArrayList<UserPropertiesInfo>();
				    	 	UserPropertiesInfo userPropertiesInfo = new UserPropertiesInfo();
				    	 	userPropertiesInfo.setUserId(userDao.getUser(userId));
				    	 	userPropertiesInfo.setPropertiestypeId(userDao.getUserPropertyTypeId(physician.getDiseaseType()));
				    	 	propertiesInfoList.add(userPropertiesInfo);
				    	 	//----------------- Assign rights to mail notification ----------------------
				    	 	userPropertiesInfo = new UserPropertiesInfo();
				    	 	userPropertiesInfo.setUserId(userDao.getUser(user.getLoginId()));
				    	 	userPropertiesInfo.setPropertiestypeId(new PropertiesType(10));
				    	 	propertiesInfoList.add(userPropertiesInfo);
				    	 	//----------------- End  -------------------------------------------------
				    	 	//----------------- Assign rights to System Setting ----------------------
				    	 	if(physician.getRoleCode().equals("SYSTEM_ADMIN")||physician.getRoleCode().equals("DATA_ADMIN")){
				    	 		userPropertiesInfo = new UserPropertiesInfo();
				    	 		userPropertiesInfo.setUserId(userDao.getUser(userId));
				    	 		userPropertiesInfo.setPropertiestypeId(new PropertiesType(9));// 9 for SYSTEM_SETTING
				    	 		propertiesInfoList.add(userPropertiesInfo);
				    	 	}
				    	 	//----------------- End  -------------------------------------------------
				    	 	userDao.updateAllUserPropertiesInfo(propertiesInfoList);
					  }
					  response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
					  response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
				  }else{
					  log.error(" Username already exist");
					  response.setResponseCode(MedikmConstants.USER_EXIST_RESPONSE_CODE);
					  response.setResponseMessage("Username already exist.");
					  response.setPhysicianId(0);
				  }
				  
			  }
		  } else {
				log.error("Authentication Failed");
				response.setAuthenticationKey("");
				response.setResponseCode(String
						.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
				response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
			}
		}catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in editPhysician Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
	
		log.info("In Physician Service :: Editing Physician End");
		return response;
	}

	@Override
	@Transactional
	public CancerTypeResponse addCancerType(CancerTypeRequest cancerTypeRequest, String ipAddress) {
		log.info("In Master Service :: Inserting CancerType Start");
	     CancerTypeResponse response = new CancerTypeResponse();
		try {
			if (authenticationService.authenticateAuthToken(cancerTypeRequest.getAuthToken(), ipAddress)) {		
		CancerType c=new CancerType();
		BeanUtils.copyProperties(c, cancerTypeRequest);
		c.setCName(cancerTypeRequest.getcName());
		c.setDiseasetypeId(cancerTypeDao.getDiseaseTypeById(cancerTypeRequest.getDiseaseType()));
		c.setDiseaseSubType(cancerTypeDao.getDiseaseSubTypeById(cancerTypeRequest.getDiseaseSubTypeId()));
		
		boolean isExist = cancerTypeDao.isCancerTypeExist(c);
		if (!isExist) {
			Integer cancerTypeId = cancerTypeDao.insertCancerType(c);
			response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
			response.setCanTypeId(cancerTypeId);
		} else {
			response.setResponseCode(MedikmConstants.CANCER_TYPE_EXIST_RESPONSE_CODE);
		}
		
		
		}else {
			log.error("Authentication Failed");
			response.setAuthenticationKey("");
			response.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	}catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in addCancerType Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
			response.setCanTypeId(0);
		}
		log.info("In CancerType Service :: Inserting CancerType End");
		return response;
	}

	@Override
	public MedikmResponse editCancerType(CancerTypeRequest cancerTypeRequest, String ipAddress) {
		MedikmResponse response = new MedikmResponse();
		try {
			log.info("In CancerType Service :: Editing CancerType Start");
			if (authenticationService.authenticateAuthToken(cancerTypeRequest.getAuthToken(), ipAddress)) {
			    CancerType c = cancerTypeDao.getCancerTypeById(cancerTypeRequest.getCanTypeId());
				BeanUtils.copyProperties(c, cancerTypeRequest);
				c.setCName(cancerTypeRequest.getcName());
				c.setDiseasetypeId(cancerTypeDao.getDiseaseTypeById(cancerTypeRequest.getDiseaseType()));
				c.setDiseaseSubType(cancerTypeDao.getDiseaseSubTypeById(cancerTypeRequest.getDiseaseSubTypeId()));
				/*cancerTypeDao.updateCancerType(c);
				response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);*/
				boolean isExist = cancerTypeDao.isCancerTypeExist(c);
				if (!isExist) {
					cancerTypeDao.updateCancerType(c);
					response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
					response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
				} else {
					response.setResponseCode(MedikmConstants.CANCER_TYPE_EXIST_RESPONSE_CODE);
				}
				
			
		}else {
			log.error("Authentication Failed");
			response.setAuthenticationKey("");
			response.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	} catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in editCancerType Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		log.info("In CancerType Service :: Editing CancerType End");
		return response;
	}

	@Override
	@Transactional
	public CancerSubTypeResponse addCancerSubType(CancerSubTypeRequest cancerSubTypeRequest, String ipAddress) {
		log.info("In Master Service :: Inserting CancerSubType Start");
	     CancerSubTypeResponse response = new CancerSubTypeResponse();
		try {
			if (authenticationService.authenticateAuthToken(cancerSubTypeRequest.getAuthToken(), ipAddress)) {
		CancerSubType c=new CancerSubType();
		BeanUtils.copyProperties(c, cancerSubTypeRequest);
		c.setCancerTypeId(cancerSubTypeDao.getCancerTypeById(cancerSubTypeRequest.getCancerType()));
		/*Integer cancerSubTypeId = cancerSubTypeDao.insertCancerSubType(c);
		response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
		response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
		response.setCanSubTypeId(cancerSubTypeId);*/
		boolean isExist = cancerSubTypeDao.isCancerSubTypeExist(c);
		if (!isExist) {
			Integer cancerSubTypeId = cancerSubTypeDao.insertCancerSubType(c);
			response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
			response.setCanSubTypeId(cancerSubTypeId);
		} else {
			response.setResponseCode(MedikmConstants.CANCER_TYPE_EXIST_RESPONSE_CODE);
		}
		}else {
			log.error("Authentication Failed");
			response.setAuthenticationKey("");
			response.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	}catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in addSubCancerType Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
			response.setCanSubTypeId(0);
		}
		log.info("In CancerSubType Service :: Inserting CancerSubType End");
		return response;
	}

	@Override
	public MedikmResponse editCancerSubType(CancerSubTypeRequest cancerSubTypeRequest, String ipAddress) {
		MedikmResponse response = new MedikmResponse();
		try {
			if (authenticationService.authenticateAuthToken(cancerSubTypeRequest.getAuthToken(), ipAddress)) {
			log.info("In CancerSubType Service :: Editing CancerSubType Start");
			
			CancerSubType c = cancerSubTypeDao.getCancerSubTypeById(cancerSubTypeRequest.getCanSubTypeId());
				BeanUtils.copyProperties(c, cancerSubTypeRequest);
				c.setCancerTypeId(cancerSubTypeDao.getCancerTypeById(cancerSubTypeRequest.getCancerType()));
				/*cancerSubTypeDao.updateCancerSubType(c);
				response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);*/
				boolean isExist = cancerSubTypeDao.isCancerSubTypeExist(c);
				if (!isExist) {
					cancerSubTypeDao.updateCancerSubType(c);
					response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
					response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
				} else {
					response.setResponseCode(MedikmConstants.CANCER_TYPE_EXIST_RESPONSE_CODE);
				}
			
		}else {
			log.error("Authentication Failed");
			response.setAuthenticationKey("");
			response.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	} catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in editCancerSubType Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		log.info("In CancerSubType Service :: Editing CancerSubType End");
		return response;
	}

	@Override
	@Transactional
	public FunctionalStatusResponse addFunctionalStatus(FunctionalStatusRequest functionalStatusRequest, String ipAddress) {
		log.info("In Functionalstatus Service :: Inserting Functional Status Start");
	     FunctionalStatusResponse response = new FunctionalStatusResponse();
		try {
			if (authenticationService.authenticateAuthToken(functionalStatusRequest.getAuthToken(), ipAddress)) {
		Functionalstatus f = new Functionalstatus();
		BeanUtils.copyProperties(f, functionalStatusRequest);
		Integer Id = functionalStatusDao.insertFunctionalStatus(f);
		response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
		response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
		response.setId(Id);
		}else {
			log.error("Authentication Failed");
			response.setAuthenticationKey("");
			response.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	}catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in addFunctionalStatus Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
			response.setId(0);
		}
		log.info("In FunctionStatus Service :: Inserting FunctionStatus End");
		return response;
	}

	@Override
	@Transactional
	public MedikmResponse editFunctionalStatus(FunctionalStatusRequest functionalStatusRequest, String ipAddress) {
		MedikmResponse response = new MedikmResponse();
		try {
			if (authenticationService.authenticateAuthToken(functionalStatusRequest.getAuthToken(), ipAddress)) {
			    log.info("In Functional Status Service :: Editing FunctionalStatus Start");
			    Functionalstatus f = functionalStatusDao.getFunctionalStatusById(functionalStatusRequest.getId());
				BeanUtils.copyProperties(f, functionalStatusRequest);
				functionalStatusDao.updateFunctionalStatus(f);
				response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
			
		}else {
			log.error("Authentication Failed");
			response.setAuthenticationKey("");
			response.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	} catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in editFunctionalStatus Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		log.info("In FunctionalStatus Service :: Editing FunctinalStatus End");
		return response;
	}

	@Override
	@Transactional
	public ImagingStatusResponse addImagingStatus(ImagingStatusRequest imagingStatusRequest, String ipAddress) {
		log.info("In Master Service :: Inserting Imaging Start");
		ImagingStatusResponse response = new ImagingStatusResponse();
		try {
			if (authenticationService.authenticateAuthToken(imagingStatusRequest.getAuthToken(), ipAddress)) {
		WorkupKindType workupKindType= new WorkupKindType();
		BeanUtils.copyProperties(workupKindType, imagingStatusRequest);
		workupKindType.setDxWkType(imagingStatusDao.getDxWkTypeById(imagingStatusRequest.getRefId()));
		workupKindType.setDiseaseType(imagingStatusDao.getDiseaseTypeById(imagingStatusRequest.getDiseaseTypeId()));
		Integer Id = imagingStatusDao.insertImagingStatus(workupKindType);
		response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
		response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
		response.setTypeId(Id);
		}else {
			log.error("Authentication Failed");
			response.setAuthenticationKey("");
			response.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	}catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in addImaging Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
			response.setTypeId(0);
		}
		log.info("In ImagingStatus Service :: Inserting ImagingStatus End");
		return response;
	}

	@Override
	@Transactional
	public MedikmResponse editImagingStatus(ImagingStatusRequest imagingStatusRequest, String ipAddress) {
		MedikmResponse response = new MedikmResponse();
		try {
			if (authenticationService.authenticateAuthToken(imagingStatusRequest.getAuthToken(), ipAddress)) {
			    log.info("In Imaging Status Service :: Editing ImagingStatus Start");
			    WorkupKindType workupKindType = imagingStatusDao.getImagingStatusById(imagingStatusRequest.getTypeId());
				BeanUtils.copyProperties(workupKindType, imagingStatusRequest);
				workupKindType.setDxWkType(imagingStatusDao.getDxWkTypeById(imagingStatusRequest.getRefId()));
				workupKindType.setDiseaseType(imagingStatusDao.getDiseaseTypeById(imagingStatusRequest.getDiseaseTypeId()));
				imagingStatusDao.updateImagingStatus(workupKindType);
				response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
			
		} else {
			log.error("Authentication Failed");
			response.setAuthenticationKey("");
			response.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	}catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in editImagingStatus Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		log.info("In ImagingStatus Service :: Editing ImagingStatus End");
		return response;
	}

	@Override
	@Transactional
	public BiopsyTypeResponse addBiopsyType(BiopsyTypeRequest biopsyTypeRequest, String ipAddress) {
		log.info("In Master Service :: Inserting Biopsy Start");
		BiopsyTypeResponse response = new BiopsyTypeResponse();
		try {
			if (authenticationService.authenticateAuthToken(biopsyTypeRequest.getAuthToken(), ipAddress)) {
		BiopsyType biopsyType= new BiopsyType();
		biopsyType.setBName(biopsyTypeRequest.getbName());
		Integer Id = biopsyTypeDao.insertBiopsyType(biopsyType);
		response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
		response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
		response.setTypeId(Id);
		}else {
			log.error("Authentication Failed");
			response.setAuthenticationKey("");
			response.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	}catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in addBiopsyType Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
			response.setTypeId(0);
		}
		log.info("In BiopsyType Service :: Inserting BiopsyType End");
		return response;
	}

	@Override
	@Transactional
	public MedikmResponse editBiopsyType(BiopsyTypeRequest biopsyTypeRequest, String ipAddress) {
		MedikmResponse response = new MedikmResponse();
		try {
			if (authenticationService.authenticateAuthToken(biopsyTypeRequest.getAuthToken(), ipAddress)) {
			    log.info("In BiopsyType Service :: Editing BiopsyType Start");
			    BiopsyType biopsyType = biopsyTypeDao.getBiopsyTypeById(biopsyTypeRequest.getTypeId());
			    biopsyType.setBName(biopsyTypeRequest.getbName());
				biopsyTypeDao.updateBiopsyType(biopsyType);
				response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
			
		} else {
			log.error("Authentication Failed");
			response.setAuthenticationKey("");
			response.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	}catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in editBiopsyType Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		log.info("In BiopsyType Service :: Editing BiopsyType End");
		return response;
	}

	@Override
	@Transactional
	public ReasonForPresentationResponse addReasonForPresentation(ReasonForPresentationRequest reasonForPresentationRequest, String ipAddress) {
		log.info("In ReasonForPresentationResponse Service :: Inserting ReasonForPresentation Start");
		ReasonForPresentationResponse response = new ReasonForPresentationResponse();
		try {
			if (authenticationService.authenticateAuthToken(reasonForPresentationRequest.getAuthToken(), ipAddress)) {
		ReasonForPresentation reasonForPresentation= new ReasonForPresentation();
		BeanUtils.copyProperties(reasonForPresentation, reasonForPresentationRequest);
		Integer Id = reasonForPresentationDao.insertReasonForPresentation(reasonForPresentation);
		response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
		response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
		response.setTypeId(Id);
		}else {
			log.error("Authentication Failed");
			response.setAuthenticationKey("");
			response.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	}catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in ReasonForPresentation Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
			response.setTypeId(0);
		}
		log.info("In ReasonForPresentation Service :: Inserting ReasonForPresentation End");
		return response;
	}

	@Override
	@Transactional
	public MedikmResponse editReasonForPresentation(ReasonForPresentationRequest reasonForPresentationRequest, String ipAddress) {
		MedikmResponse response = new MedikmResponse();
		try {
			if (authenticationService.authenticateAuthToken(reasonForPresentationRequest.getAuthToken(), ipAddress)) {
			    log.info("In ReasonForPresentation Service :: Editing ReasonForPresentation Start");
			    ReasonForPresentation reasonForPresentation = reasonForPresentationDao.getReasonForPresentationeById(reasonForPresentationRequest.getTypeId());
				BeanUtils.copyProperties(reasonForPresentation, reasonForPresentationRequest);
				reasonForPresentationDao.updateReasonForPresentation(reasonForPresentation);
				response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
			
		}else {
			log.error("Authentication Failed");
			response.setAuthenticationKey("");
			response.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	} catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in editReasonForPresentation Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		log.info("In ReasonForPresentation Service :: Editing ReasonForPresentation End");
		return response;
	}

	@Override
	@Transactional
	public TreatmentResponse addTreadment(TreatmentRequest treatmentRequest, String ipAddress) {
		log.info("In Master Service :: Inserting Treatment Start");
		 TreatmentResponse response = new TreatmentResponse();
		
		try {
			if (authenticationService.authenticateAuthToken(treatmentRequest.getAuthToken(), ipAddress)) {
		SurgeryType surgeryType = new SurgeryType();
		BeanUtils.copyProperties(surgeryType, treatmentRequest);
		surgeryType.setSName(treatmentRequest.getsName());
		surgeryType.setDiseaseSubType(treatmentDao.getDiseaseSubTypeById(treatmentRequest.getDiseaseSubTypeId()));
		Integer Id = treatmentDao.insertTreatmentType(surgeryType);
		response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
		response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
		response.setTypeId(Id);
		}else {
			log.error("Authentication Failed");
			response.setAuthenticationKey("");
			response.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	}catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in Treatment Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
			response.setTypeId(0);
		}
		log.info("In Treatment Service :: Inserting Treatment End");
		return response;
	}

	@Override
	@Transactional
	public MedikmResponse editTreatment(TreatmentRequest treatmentRequest, String ipAddress) {
		MedikmResponse response = new MedikmResponse();
		try {
			if (authenticationService.authenticateAuthToken(treatmentRequest.getAuthToken(), ipAddress)) {
			    log.info("In Treatment Service :: Editing Treatment Start");
			    SurgeryType surgeryType = treatmentDao.getTreatmentTypeById(treatmentRequest.getTypeId());
				BeanUtils.copyProperties(surgeryType, treatmentRequest);
				surgeryType.setSName(treatmentRequest.getsName());
				surgeryType.setDiseaseSubType(treatmentDao.getDiseaseSubTypeById(treatmentRequest.getDiseaseSubTypeId()));
				treatmentDao.updateTreatmentType(surgeryType);
				response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
			
		} else {
			log.error("Authentication Failed");
			response.setAuthenticationKey("");
			response.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	}catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in editTreatment Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		log.info("In Treatment Service :: Editing Treatment End");
		return response;
	}

	@Override
	@Transactional
	public MedikmResponse updateUserStatus(PhysicianRequest physician, String ipAddress) {
		MedikmResponse response = new MedikmResponse();
		try {
			if (authenticationService.authenticateAuthToken(physician.getAuthToken(), ipAddress)) {
			User user=userDao.getUserByPhycisianID(physician.getPhysicianId());
			if(user!=null){
				if(user.getIsActive()==true){
					user.setIsActive(false);
					userDao.updateUser(user);
				}else{
					user.setIsActive(true);
					userDao.updateUser(user);
					
				}
				response.setResponseCode(MedikmConstants.DEFAULT_SUCCESS_CODE);
				response.setResponseMessage(MedikmConstants.DEFAULT_SUCCESS_MESSAGE);
			}else{
				log.info("User account can not be deactive");
				response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
				response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
			}
		}else {
			log.error("Authentication Failed");
			response.setAuthenticationKey("");
			response.setResponseCode(String
					.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			response.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		}
	}catch (Exception ex) {
			ex.printStackTrace();
			log.error("Error in updateUserStatus Method :: " + ex);
			response.setResponseCode(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE);
			response.setResponseMessage(MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_MESSAGE);
		}
		log.info("In updateUserStatus Service :: Editing user End");
		return response;
	}

	
	}

	
	


