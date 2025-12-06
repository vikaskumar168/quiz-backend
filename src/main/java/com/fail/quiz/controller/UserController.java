package com.fail.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fail.quiz.pojos.RegisterUserRequest;
import com.fail.quiz.pojos.RegisterUserResponse;
import com.fail.quiz.service.UserServiceImpl;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@PostMapping("/api/quiz/user/register")
	public RegisterUserResponse registerUser(@RequestBody @Valid RegisterUserRequest registerUserRequest) {
		long currentTime = System.currentTimeMillis();
		try {
			return userServiceImpl.registerUser(registerUserRequest);
		} finally {
			log.debug("Time Taken to registerUser: {}",System.currentTimeMillis()-currentTime);
		}
	}
}
