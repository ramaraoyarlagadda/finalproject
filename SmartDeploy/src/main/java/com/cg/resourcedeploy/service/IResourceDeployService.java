package com.cg.resourcedeploy.service;

import java.util.List;

import com.cg.resourcedeploy.dto.EmployeeMasterEntity;
import com.cg.resourcedeploy.exceptions.ResourceDeployExceptions;

public interface IResourceDeployService {

	public List<Object[]> buEmployeeDate(EmployeeMasterEntity employeeMasterEntity) throws ResourceDeployExceptions;

//	public List<Object[]> resourceForDeploy() throws ResourceDeployExceptions;
//
//	public List<Object[]> resourceDeployed() throws ResourceDeployExceptions;

	public List<Object[]> resourcesAvailable() throws ResourceDeployExceptions;

}
