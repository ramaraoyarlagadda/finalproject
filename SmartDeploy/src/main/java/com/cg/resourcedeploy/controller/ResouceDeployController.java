package com.cg.resourcedeploy.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.resourcedeploy.ResourceDeployApplication;
import com.cg.resourcedeploy.dto.EmployeeMasterBean;
import com.cg.resourcedeploy.exceptions.ResourceDeployExceptions;
import com.cg.resourcedeploy.service.IResourceDeployService;

@RestController
@CrossOrigin
public class ResouceDeployController {
	
	
	Logger logger=org.slf4j.LoggerFactory.getLogger(ResourceDeployApplication.class);
	
	@Autowired
	private IResourceDeployService resourceDeployService;
	
	@PostMapping(value="/buemployeedata", consumes="application/json" ,produces="application/json")
	@ResponseBody
	public List<Object[]> getBuEmployeeBenchData(@RequestBody EmployeeMasterBean employeeMasterBean) throws ResourceDeployExceptions {
		logger.info("GetBuEmployeeData started");
		List<Object[]> resource=resourceDeployService.buEmployeeDate(employeeMasterBean);
		return  resource;
		
	}
	
	@GetMapping(value="/benchresourcedata" ,produces="application/json")
	@ResponseBody
	public List<Object[]> resourceForDeploy() throws ResourceDeployExceptions{
		logger.info("BenchResourceData method started");
		 return resourceDeployService.resourceForDeploy();
	}
	
	@GetMapping(value="/deployedresourcedata", produces="application/json")
	@ResponseBody
	public List<Object[]> resourceDeployed() throws ResourceDeployExceptions{
		logger.info("DeployedResource Method started");
		return resourceDeployService.resourceDeployed();
	}
	
	@GetMapping(value="/completeemployeedetails", produces="application/json")
	@ResponseBody
	public List<Object[]> employeeResources() throws ResourceDeployExceptions{
		logger.info(" EmployeeResources Method started");
		return resourceDeployService.resourcesAvailable();
	}

}
