package com.cg.resourcedeploy.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@ControllerAdvice
@RestController
public class ResourceDeployExceptionController {
	
	@ExceptionHandler(ResourceDeployExceptions.class)
	public @ResponseBody ErrorResponse handleResourceNotFound(ResourceDeployExceptions exception,
			 HttpServletRequest request) {

		ErrorResponse error = new ErrorResponse();
		error.setErrorMessage(exception.getMessage());
		error.setCallerURL(request.getRequestURI());

		return error;
	}
	
	

}
