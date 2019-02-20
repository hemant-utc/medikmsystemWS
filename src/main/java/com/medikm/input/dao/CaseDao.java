/**
 * 
 */
package com.medikm.input.dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;

import com.medikm.input.entity.CancerSubType;
import com.medikm.input.entity.CancerType;
import com.medikm.input.entity.Case1;
import com.medikm.input.entity.Gemonics;
import com.medikm.input.entity.Genetics;
import com.medikm.input.entity.Physician;
import com.medikm.input.entity.TnmStage;
import com.medikm.input.entity.TumorLocation;

/**
 * @author Saikat
 * 
 */
public interface CaseDao extends Serializable {

	public Integer insertCase(Case1 case1);

	public void updateCase(Case1 case1);

	public Physician getPhysicianById(Integer id);

	public CancerSubType getCancerSubTypeById(Integer canSubTypeId);

	public CancerType getCancerTypeById(Integer canTypeId);

	public Genetics getGeneticsById(Integer id);

	public Gemonics getGemonicsById(Integer id);

	public TnmStage getTnmStageById(Integer stageId);

	public Case1 getCaseById(Integer caseId);

	public TumorLocation getTLocationById(Integer tLocationId);

	public SessionFactory getSessionFactory();
	
}
