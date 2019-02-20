/**
 * 
 */
package com.medikm.input.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medikm.input.dao.UserDao;
import com.medikm.input.entity.Customer;
import com.medikm.input.entity.PropertiesType;
import com.medikm.input.entity.User;
import com.medikm.input.entity.UserPropertiesInfo;

/**
 * @author Saikat
 * 
 */
@Repository("UserDao")
public class UserDaoImpl implements UserDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7280610446000532261L;
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public User getUserByAuthToken(String authToken) {
		List<User> li = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(User.class).add(Restrictions.eq("authToken", authToken.trim())));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@Override
	@Transactional
	public Integer insertUser(User user) {
		hibernateTemplate.save(user);
		return user.getLoginId();
	}

	@Override
	@Transactional
	public Customer getCustomerId() {
		Customer customer = new Customer(123456);
		return customer;
	}

	@Override
	@Transactional
	public Integer insertUserPropertiesInfo(UserPropertiesInfo userPropertiesInfo) {
		hibernateTemplate.save(userPropertiesInfo);
		return userPropertiesInfo.getUserpropertyinfoId();
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public User getUser(Integer userId) {
		List<User> userList = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(User.class).add(Restrictions.eq("loginId", userId)));
		if (userList != null && userList.size() > 0) {
			return userList.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public PropertiesType getUserPropertyTypeId(Integer diseaseTypeId) {
		List<PropertiesType> propertyList = hibernateTemplate.findByCriteria(DetachedCriteria
				.forClass(PropertiesType.class).add(Restrictions.eq("propertiestypeId", diseaseTypeId)));
		if (propertyList != null && propertyList.size() > 0) {
			return propertyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		hibernateTemplate.merge(user);

	}

	@Override
	@Transactional
	public void updateUserPropertiesInfo(UserPropertiesInfo userPropertiesInfo) {
		hibernateTemplate.merge(userPropertiesInfo);
	}

	@Override
	@Transactional
	public void updateAllUserPropertiesInfo(List<UserPropertiesInfo> userPropertiesInfoList) {
		hibernateTemplate.saveOrUpdateAll(userPropertiesInfoList);
	}

	@SuppressWarnings("unchecked")
	@Override
	public User getUserByPhycisianID(Integer physicianId) {
		List<User> userList = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(User.class).add(Restrictions.eq("physicianId", physicianId)));
		if (userList != null && userList.size() > 0) {
			return userList.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public User getUserByUsername(String username) {
		List<User> userList = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(User.class).add(Restrictions.eq("userName", username)));
		if (userList != null && userList.size() > 0) {
			return userList.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public UserPropertiesInfo getUserPropertiesInfoByUserId(Integer userId) {
		List<UserPropertiesInfo> userList = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(UserPropertiesInfo.class).add(Restrictions.eq("userId.loginId", userId)));
		if (userList != null && userList.size() > 0) {
			return userList.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<UserPropertiesInfo> getUserPropertiesInfoListByUserId(Integer userId) {
		List<UserPropertiesInfo> userList = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(UserPropertiesInfo.class).add(Restrictions.eq("userId.loginId", userId)));
		// if (userList != null && userList.size() > 0) {
		return userList;
		// } else {
		// return null;
		// }
	}

	@Override
	@Transactional
	public void removeUserPropertiesInfoListbyUserId(List<UserPropertiesInfo> userPropertiesInfoList) {
		hibernateTemplate.deleteAll(userPropertiesInfoList);
	}

}
