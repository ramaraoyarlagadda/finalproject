package com.cg.resourcedeploy.stub;

import java.util.List;

import com.cg.resourcedeploy.dto.EmployeeMasterBean;
import com.cg.resourcedeploy.exceptions.ResourceDeployExceptions;

public class ResourceDeployDaoImplStub {
	
	public List<Object[]> fetchDataByBu(EmployeeMasterBean employeeMasterBean) throws ResourceDeployExceptions{
		return null;
	}
	
	public List<Object[]> fetchResourceForDeploying() throws ResourceDeployExceptions{
		return null;
	}
	public List<Object[]> fetchResourcesDeployed() throws ResourceDeployExceptions
	{
		return null;
}
}