package com.fail.quiz.pojos;

public class RegisterUserRequest {

    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String confirmPassword;
    private String userName;
    private String profileUrl;

}
