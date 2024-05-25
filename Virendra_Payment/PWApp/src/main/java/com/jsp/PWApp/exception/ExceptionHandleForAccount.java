package com.jsp.PWApp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.cultfit.util.ResponseStructure;

@RestControllerAdvice
public class ExceptionHandleForAccount  {

	@ExceptionHandler(UserNotFound.class)
	public ResponseEntity<ResponseStructure<String>> emailNoFound(UserNotFound e) {
		ResponseStructure<String> rs = new ResponseStructure<String>();

		rs.setData(e.getMsg());
		rs.setMessage("User Account not found ....");
		rs.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>>(rs, HttpStatus.NOT_FOUND);

	}
}
