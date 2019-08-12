package com.cg.resourcedeploy.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.resourcedeploy.dao.IResourceDeployDao;
import com.cg.resourcedeploy.dto.EmployeeMasterBean;
import com.cg.resourcedeploy.exceptions.ResourceDeployExceptions;

@Repository
@Transactional
public class ResourceDeployDaoImpl implements IResourceDeployDao {
	static String buEmployee;

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Object[]> fetchDataByBu(EmployeeMasterBean employeeMasterBean) throws ResourceDeployExceptions {
		String bu = employeeMasterBean.getBu();
		System.out.println(bu);
		buEmployee = bu;
		TypedQuery<Object[]> query = entityManager.createQuery(
				"SELECT SUM(CASE WHEN B.availabilityName='bench_available' THEN 1 ELSE 0 END)"
						+ " AS Bench, SUM(CASE WHEN B.availabilityName='bench_unavailable' THEN 1 ELSE 0 END) "
						+ "AS DEPLOYED FROM BenchMasterBean B JOIN EmployeeMasterBean E ON"
						+ " B.benchAvailabilityId=E.benchMasterBean.benchAvailabilityId" + " WHERE E.bu=: bu1 ",
				Object[].class);
		query.setParameter("bu1", employeeMasterBean.getBu());
		List<Object[]> results = query.getResultList();
		System.out.println(results);
		return results;

	}

	@Override
	public List<Object[]> fetchResourceForDeploying() throws ResourceDeployExceptions {

		TypedQuery<Object[]> query = entityManager
				.createQuery("SELECT e.empId,e.empName,e.emailId,e.location,g.gradeName "
						+ "FROM EmployeeMasterBean e join GradeMasterBean g"
						+ " on e.gradeMasterBean.gradeId=g.gradeId " + "join BenchMasterBean b "
						+ "on b.benchAvailabilityId=e.benchMasterBean.benchAvailabilityId "
						+ "WHERE b.availabilityName='bench_available' AND e.bu=: bu2 ", Object[].class);
		System.out.println(buEmployee);
		query.setParameter("bu2", buEmployee);
		List<Object[]> results = query.getResultList();
		return results;

	}

	@Override
	public List<Object[]> fetchResourcesDeployed() throws ResourceDeployExceptions {

		TypedQuery<Object[]> query = entityManager
				.createQuery("SELECT e.empId,e.empName,e.emailId,e.location,g.gradeName "
						+ "FROM EmployeeMasterBean e join GradeMasterBean g"
						+ " on e.gradeMasterBean.gradeId=g.gradeId " + "join BenchMasterBean b "
						+ "on b.benchAvailabilityId=e.benchMasterBean.benchAvailabilityId "
						+ "WHERE b.availabilityName='bench_unavailable' AND e.bu=: bu2 ", Object[].class);
		System.out.println(buEmployee);
		query.setParameter("bu2", buEmployee);
		List<Object[]> results = query.getResultList();
		System.out.println(results.toString());
		return results;
	}

	@Override
	public List<Object[]> fetchEmployeeResources() throws ResourceDeployExceptions {

		TypedQuery<Object[]> query = entityManager.createQuery(
				"SELECT e.empId,e.empName,e.emailId,e.location,g.gradeName,b.availabilityName "
						+ "FROM EmployeeMasterBean e join GradeMasterBean g"
						+ " on e.gradeMasterBean.gradeId=g.gradeId " + "join BenchMasterBean b "
						+ "on b.benchAvailabilityId=e.benchMasterBean.benchAvailabilityId " + "WHERE e.bu=: bu2 ",
				Object[].class);
		System.out.println(buEmployee);
		query.setParameter("bu2", buEmployee);
		List<Object[]> results = query.getResultList();
		System.out.println(results.toString());
		return results;
	}

}
