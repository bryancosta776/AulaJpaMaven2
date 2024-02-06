package com.AulaJpaMaven2.scope.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	
	public ResourceNotFoundException(Object id) {
		//construtor da super classe
		super("Resource not found. Id " + id);
	}
}
