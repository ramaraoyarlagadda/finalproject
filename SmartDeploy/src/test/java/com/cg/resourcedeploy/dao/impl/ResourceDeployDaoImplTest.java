package com.cg.resourcedeploy.dao.impl;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import net.minidev.json.JSONObject;

public class ResourceDeployDaoImplTest {
	
	class SpringTestContext {
		
		@Bean
		public RestTemplate getRestTemplate() {
			return new RestTemplate();
		}

		@Bean
		public JSONObject getJsonObject() {
			return  new JSONObject(); 
		}
	
	}

	@RunWith(SpringJUnit4ClassRunner.class)
	@ContextConfiguration(classes = SpringTestContext.class)
	public class ReportDaoImplTest {

		@Autowired
		private ResourceDeployDaoImpl resourceDeployDaoImpl;

	}
//	@Test
//	public void noOfDeployedEmployee{
//		assertTrue();
//	
//	}
}
	
