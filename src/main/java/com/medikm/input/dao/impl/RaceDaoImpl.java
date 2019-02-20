package com.medikm.input.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.medikm.input.dao.RaceDao;
import com.medikm.input.entity.Race;

@Repository("RaceDao")
public class RaceDaoImpl implements RaceDao {

	@Autowired
	HibernateTemplate hibernatTemplate;

	@Override
	public void saveOrUpdate(Race race) {

		hibernatTemplate.saveOrUpdate(race);

	}

}
