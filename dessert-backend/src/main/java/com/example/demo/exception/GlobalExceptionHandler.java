package com.example.demo.exception;

import java.net.http.HttpHeaders;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.details.ErrorDetails;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	
	
	public ResponseEntity<?> resourceNotFoundEntity(MethodArgumentNotValidException arg,Exception header,WebRequest req){
		ErrorDetails e=new ErrorDetails(new Date(), header.getMessage(), PAGE_NOT_FOUND_LOG_CATEGORY);
		return new ResponseEntity<>(e,HttpStatus.METHOD_NOT_ALLOWED);
	}

}
