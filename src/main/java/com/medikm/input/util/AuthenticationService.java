/**
 * 
 */
package com.medikm.input.util;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.medikm.input.dao.UserDao;
import com.medikm.input.entity.User;

/**
 * @author Saikat
 *
 */
@Service("AuthenticationService")
public class AuthenticationService {

	@Value("${acceptip}")
	private String acceptip;

	private Logger log = Logger.getLogger(AuthenticationService.class);

	@Autowired
	private UserDao userDao;

	public boolean authenticateAuthToken(String authToken, String ipAddress) {
		boolean isAuthenticate = false;
		try {
			User u = userDao.getUserByAuthToken(authToken);
			if (u != null && acceptip.equals(ipAddress)) {
				isAuthenticate = true;
			} else {
				isAuthenticate = false;
			}
		} catch (Exception ex) {
			log.error("Error in authenticate Auth Token" + ex);
			ex.printStackTrace();
			isAuthenticate = false;
		}
		return isAuthenticate;
	}
}
