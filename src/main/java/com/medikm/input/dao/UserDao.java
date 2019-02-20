/**
 * 
 */
package com.medikm.input.dao;

import java.io.Serializable;
import java.util.List;

import com.medikm.input.entity.Customer;
import com.medikm.input.entity.PropertiesType;
import com.medikm.input.entity.User;
import com.medikm.input.entity.UserPropertiesInfo;

/**
 * @author Saikat
 *
 */
public interface UserDao extends Serializable {

	public User getUserByAuthToken(String authToken);

	public Integer insertUser(User user);

	public Customer getCustomerId();

	public Integer insertUserPropertiesInfo(UserPropertiesInfo userPropertiesInfo);

	public User getUser(Integer userId);

	public PropertiesType getUserPropertyTypeId(Integer diseaseTypeId);

	public void updateUser(User user);

	public void updateUserPropertiesInfo(UserPropertiesInfo userPropertiesInfo);

	public List<UserPropertiesInfo> getUserPropertiesInfoListByUserId(Integer userId);

	public void updateAllUserPropertiesInfo(List<UserPropertiesInfo> userPropertiesInfo);

	public User getUserByPhycisianID(Integer physicianId);

	public User getUserByUsername(String username);

	public UserPropertiesInfo getUserPropertiesInfoByUserId(Integer userId);

	public void removeUserPropertiesInfoListbyUserId(List<UserPropertiesInfo> userPropertiesInfo);
	
}
