package com.cg.resourcedeploy.stub;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.resourcedeploy.dao.IResourceDeployDao;
import com.cg.resourcedeploy.dto.EmployeeMasterEntity;
import com.cg.resourcedeploy.exceptions.ResourceDeployExceptions;

@Component
public class ResourceDeployDaoImplStub implements IResourceDeployDao {

	@Override
	public List<Object[]> fetchDataByBu(EmployeeMasterEntity employeeMasterBean) throws ResourceDeployExceptions {

		return null;
	}



	@Override
	public List<Object[]> fetchEmployeeResources() throws ResourceDeployExceptions {

		return null;
	}

}