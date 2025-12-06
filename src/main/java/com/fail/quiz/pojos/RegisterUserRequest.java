package com.fail.quiz.pojos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterUserRequest {
	
	
	@NotBlank	
    private String name;
	@NotBlank
    private String email;
	@NotBlank
    private String password;
	private String userName;
    private String profileUrl;

}
