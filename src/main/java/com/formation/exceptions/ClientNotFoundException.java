package com.formation.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// associe un status particulier
@ResponseStatus(value =HttpStatus.NOT_FOUND)
public class ClientNotFoundException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;

	public ClientNotFoundException(String message) {
		super(message);
	}
	
}
