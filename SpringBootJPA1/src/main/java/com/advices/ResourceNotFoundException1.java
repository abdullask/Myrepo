package com.advices;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException1 extends Exception
{
	public ResourceNotFoundException1(String message){
	        super(message);
	    }

	public void ResourceNotFoundException(String message) {
		// TODO Auto-generated constructor stub
	}
}