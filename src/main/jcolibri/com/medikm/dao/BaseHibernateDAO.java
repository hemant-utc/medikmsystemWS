package com.medikm.dao;

import com.medikm.hbm.HibernateSessionFactory;
import org.hibernate.Session;

/**
 * Data access object (DAO) for domain model
 * 
 * @author MyEclipse Persistence Tools
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {

	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}

}