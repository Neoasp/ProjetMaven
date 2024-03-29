package com.formation.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// associe un status particulier
@ResponseStatus(value =HttpStatus.NOT_FOUND)
public class UnknownException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;

	public UnknownException(String message) {
		super(message);
	}
	
}

