package com.medikm.input.dao;

import com.medikm.input.entity.Functionalstatus;

public interface FunctionalStatusDao {

	public Integer insertFunctionalStatus(Functionalstatus functionalStatus);

	public void updateFunctionalStatus(Functionalstatus functionalStatus);

	public Functionalstatus getFunctionalStatusById(Integer Id);

	public Integer getLastFunctionalStatusId();

}
