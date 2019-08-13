package com.cg.resourcedeploy.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;



@ControllerAdvice
@RestController
public class ResourceDeployExceptionController {
	
//	@ExceptionHandler(ResourceDeployExceptions.class)
//	public ResponseEntity<ErrorResponse>  handleResourceNotFound(ResourceDeployExceptions exception, WebRequest request) {
//		ErrorResponse details = new ErrorResponse(exception.getMessage(), request.getDescription(false));
//		return new ResponseEntity<>(details, HttpStatus.BAD_REQUEST);
//
//	}
//	
//	@ExceptionHandler(ResourceDeployExceptions.class)
//	public ResponseEntity<ErrorResponse> resourceNotFound(ResourceDeployExceptions exception, WebRequest request) {
//		ErrorResponse details = new ErrorResponse(exception.getMessage(), request.getDescription(false));
//		return new ResponseEntity<>(details, HttpStatus.NOT_FOUND);
//
//	}
//	
//	@ExceptionHandler(ResourceDeployExceptions.class)
//	public ResponseEntity<ErrorResponse> resourceInternalError(ResourceDeployExceptions exception, WebRequest request) {
//		ErrorResponse details = new ErrorResponse(exception.getMessage(), request.getDescription(false));
//		return new ResponseEntity<>(details, HttpStatus.INTERNAL_SERVER_ERROR);
//
//	}
//	


}
