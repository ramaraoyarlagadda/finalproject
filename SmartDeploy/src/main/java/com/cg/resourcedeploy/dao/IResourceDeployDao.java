package com.cg.resourcedeploy.dao;

import java.util.List;

import com.cg.resourcedeploy.dto.EmployeeMasterEntity;
import com.cg.resourcedeploy.exceptions.ResourceDeployExceptions;
/**
 * Interface for dao layer containing 
 * method declarations
 * @author ramarao
 *
 */
public interface IResourceDeployDao {
	/**
	 * 
	 * @param employeeMasterBean
	 * @return List<Object[]> 
	 * @throws ResourceDeployExceptions
	 */

	public List<Object[]> fetchDataByBu(EmployeeMasterEntity employeeMasterBean) throws ResourceDeployExceptions;

	/**
	 * 
	 * @return
	 * @throws ResourceDeployExceptions
	 */
//	public List<Object[]> fetchResourceForDeploying() throws ResourceDeployExceptions;
//
//	public List<Object[]> fetchResourcesDeployed() throws ResourceDeployExceptions;

	public List<Object[]> fetchEmployeeResources() throws ResourceDeployExceptions;
}
