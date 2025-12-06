package com.fail.quiz.utils;

import org.springframework.stereotype.Component;

@Component
public class UserUtils {

	public String getHashedPassword(String password) {
		return password;
	}
}
