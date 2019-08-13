package com.cg.resourcedeploy.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.resourcedeploy.dao.IResourceDeployDao;
import com.cg.resourcedeploy.dto.EmployeeMasterEntity;
import com.cg.resourcedeploy.exceptions.ResourceDeployExceptions;
import com.cg.resourcedeploy.utility.ResourceDeployMessages;

@Repository
@Transactional
public class ResourceDeployDaoImpl implements IResourceDeployDao {
	static String buEmployee;
//	List<Object[]> results;

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Object[]> fetchDataByBu(EmployeeMasterEntity employeeMasterEntity) throws ResourceDeployExceptions {
		String bu = employeeMasterEntity.getBu();
		if(bu!=null) {
		buEmployee = bu;
		TypedQuery<Object[]> query = entityManager
				.createQuery("SELECT SUM(CASE WHEN bench.availabilityName='bench_available' THEN 1 ELSE 0 END)"
						+ " AS Bench, SUM(CASE WHEN bench.availabilityName='bench_unavailable' THEN 1 ELSE 0 END) "
						+ "AS DEPLOYED FROM BenchMasterEntity bench JOIN EmployeeMasterEntity employee ON"
						+ " bench.benchAvailabilityId=employee.benchMaster.benchAvailabilityId"
						+ " WHERE employee.bu=: bu1 ", Object[].class);
		query.setParameter("bu1", employeeMasterEntity.getBu());
		List<Object[]> results = query.getResultList();
		return results;
		}
		else {
			throw new ResourceDeployExceptions(ResourceDeployMessages.BU_EMPTY);
		}
		

	}



	@Override
	public List<Object[]> fetchEmployeeResources() throws ResourceDeployExceptions {

		TypedQuery<Object[]> query = entityManager.createQuery(
				"SELECT employee.empId,employee.empName,employee.emailId,employee.location,grade.gradeName,bench.availabilityName "
						+ "FROM EmployeeMasterEntity employee join GradeMasterEntity grade"
						+ " on employee.gradeMaster.gradeId=grade.gradeId " + "join BenchMasterEntity bench "
						+ "on bench.benchAvailabilityId=employee.benchMaster.benchAvailabilityId "
						+ "WHERE employee.bu=: bu2 ",
				Object[].class);
		query.setParameter("bu2", buEmployee);
		 List<Object[]> results = query.getResultList();
		if(results.isEmpty()) {
			throw new ResourceDeployExceptions(ResourceDeployMessages.BU_EMPTY);
		}
		else {
		return results;
		}
	}

}
