package com.cg.resourcedeploy.dao;

import java.util.List;

import com.cg.resourcedeploy.dto.EmployeeMasterBean;
import com.cg.resourcedeploy.exceptions.ResourceDeployExceptions;

public interface IResourceDeployDao {

	public List<Object[]> fetchDataByBu(EmployeeMasterBean employeeMasterBean) throws ResourceDeployExceptions;

	public List<Object[]> fetchResourceForDeploying() throws ResourceDeployExceptions;

	public List<Object[]> fetchResourcesDeployed() throws ResourceDeployExceptions;

	public List<Object[]> fetchEmployeeResources() throws ResourceDeployExceptions;
}
