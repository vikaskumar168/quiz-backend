package com.fail.quiz.service;

import java.sql.Timestamp;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fail.quiz.dao.UserRepo;
import com.fail.quiz.entity.User;
import com.fail.quiz.pojos.RegisterUserRequest;
import com.fail.quiz.pojos.RegisterUserResponse;
import com.fail.quiz.utils.UserUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private UserUtils userUtils;

	public RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest) {
		try {
			log.debug("registerUser:: registerUserRequest: {}", registerUserRequest);
			String email = registerUserRequest.getEmail();
			String name = registerUserRequest.getName();
			String userName = registerUserRequest.getUserName();
			String profileUrl = registerUserRequest.getProfileUrl();
			String hashedPassword = userUtils.getHashedPassword(registerUserRequest.getPassword());
			Timestamp currentDate = Timestamp.from(Instant.ofEpochMilli(System.currentTimeMillis()));
			User newUser = User.builder().email(email).name(name).userName(userName).profileUrl(profileUrl)
					.passwordHash(hashedPassword).createdAt(currentDate).isActive(true).isEmailVerified(false).build();

			userRepo.save(newUser);
			return RegisterUserResponse.builder().success(true).build();
		} catch (Exception e) {
			log.error(e.getLocalizedMessage(), e.getMessage(), e);
			return RegisterUserResponse.builder().success(false).build();
		}
	}

} // When writing signup check for email uniqueness and creating username check
	// for uniqueness.
