package com.cg.resourcedeploy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.resourcedeploy.dao.IResourceDeployDao;
import com.cg.resourcedeploy.dto.EmployeeMasterEntity;
import com.cg.resourcedeploy.exceptions.ResourceDeployExceptions;
import com.cg.resourcedeploy.service.IResourceDeployService;


@Service
public class ResourceDeployServiceImpl implements IResourceDeployService {
	
	@Autowired
	private IResourceDeployDao resourceDeployDao;

	@Override
	public List<Object[]> buEmployeeDate(EmployeeMasterEntity employeeMasterEntity) throws ResourceDeployExceptions {
		
		return resourceDeployDao.fetchDataByBu(employeeMasterEntity);
		
	}

//	@Override
//	public List<Object[]> resourceForDeploy() throws ResourceDeployExceptions{
//		
//		 return resourceDeployDao.fetchResourceForDeploying();
//	}
//
//	@Override
//	public List<Object[]> resourceDeployed() throws ResourceDeployExceptions {
//		
//		return resourceDeployDao.fetchResourcesDeployed();
//	}

	@Override
	public List<Object[]> resourcesAvailable() throws ResourceDeployExceptions {
		
		return resourceDeployDao.fetchEmployeeResources();
	}

}
