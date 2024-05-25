package com.jsp.PWApp.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserNotFound extends RuntimeException {
	private String msg = "User Account email not found";
}
