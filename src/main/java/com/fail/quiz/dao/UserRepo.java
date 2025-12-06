package com.fail.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fail.quiz.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
