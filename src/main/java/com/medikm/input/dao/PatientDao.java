/**
 * 
 */
package com.medikm.input.dao;

import java.util.List;

import com.medikm.input.entity.Functionalstatus;
import com.medikm.input.entity.Patient;
import com.medikm.input.entity.Race;

/**
 * @author Saikat
 *
 */
public interface PatientDao {

	public Integer insertPatient(Patient patient);

	public void updatePatient(Patient p);

	public Patient getPatientById(Integer patientId);

	public Integer getLastPatientId();

	public List<Race> getRaceList();

	public List<Functionalstatus> getFunctionalStatusList();

	public Functionalstatus getFunctionalStatusById(Integer functionalStatusId);

	public Race getRaceById(Integer raceId);

	public List<Patient> getPatientList();
}
