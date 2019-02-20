/**
 * 
 */
package com.medikm.input.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medikm.input.dao.PatientDao;
import com.medikm.input.entity.Functionalstatus;
import com.medikm.input.entity.Patient;
import com.medikm.input.entity.Race;

/**
 * @author Saikat
 * 
 */
@Repository("PatientDao")
public class PatientDaoImpl implements PatientDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public Integer insertPatient(Patient patient) {
		hibernateTemplate.save(patient);
		return patient.getPatientId();

	}

	@Override
	@Transactional
	public void updatePatient(Patient p) {
		hibernateTemplate.merge(p);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public Patient getPatientById(Integer patientId) {
		List<Patient> patientList = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(Patient.class).add(Restrictions.eq("patientId", patientId)));
		if (patientList != null && patientList.size() > 0) {
			return patientList.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public Integer getLastPatientId() {
		hibernateTemplate.setMaxResults(1);
		List<Integer> li = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(Patient.class).setProjection(Projections.max("patientId")));
		hibernateTemplate.setMaxResults(0);
		return li.get(0);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<Race> getRaceList() {
		return hibernateTemplate.findByCriteria(DetachedCriteria.forClass(Race.class));
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<Functionalstatus> getFunctionalStatusList() {
		return hibernateTemplate.findByCriteria(DetachedCriteria.forClass(Functionalstatus.class));
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public Functionalstatus getFunctionalStatusById(Integer functionalStatusId) {
		List<Functionalstatus> li = hibernateTemplate.findByCriteria(
				DetachedCriteria.forClass(Functionalstatus.class).add(Restrictions.eq("id", functionalStatusId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public Race getRaceById(Integer raceId) {
		List<Race> li = hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(Race.class).add(Restrictions.eq("typeId", raceId)));
		if (li != null && li.size() > 0) {
			return li.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Patient> getPatientList() {
		return hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(Patient.class).addOrder(Order.desc("patientId")));
	}

}
