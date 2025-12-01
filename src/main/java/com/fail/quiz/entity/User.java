package com.fail.quiz.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String userName;
    private String profileUrl;
}
