package com.cg.resourcedeploy.dao.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cg.resourcedeploy.dto.BenchMasterEntity;
import com.cg.resourcedeploy.dto.EmployeeMasterEntity;
import com.cg.resourcedeploy.dto.GradeMasterEntity;
import com.cg.resourcedeploy.exceptions.ResourceDeployExceptions;
import com.cg.resourcedeploy.service.impl.ResourceDeployServiceImpl;

@Configuration
@ComponentScan(basePackages = { "com.cg.resourcedeploy.service.impl",
		"com.cg.resourcedeploy.dao.stub" })

class SpringTestContext {

}

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringTestContext.class)
public class ResourceDeployDaoImplTest {
	
	@Autowired
	ResourceDeployServiceImpl resourceDeployService;
	
	EmployeeMasterEntity employeeMasterEntity;
	GradeMasterEntity gradeMasterEntity;
	BenchMasterEntity benchMasterEntity;
	
	@Test
	public void getDataByBuTypeTest() throws ResourceDeployExceptions{
		String bu=null;
		employeeMasterEntity.setBu(bu);
		List<Object[]> result=resourceDeployService.buEmployeeDate(employeeMasterEntity);
		
		
	}
	


}
	
