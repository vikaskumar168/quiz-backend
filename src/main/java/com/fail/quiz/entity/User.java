package com.fail.quiz.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name="user_id", nullable = false)
    private Long userId;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="email", nullable = false)
    private String email;
    @Column(name="password_hash", nullable = false, unique = true)
    private String passwordHash;
    @Column(name="user_name", unique = true)
    private String userName;
    @Column(name="profile_url")
    private String profileUrl;
    @Column(name="status")  
    private String status;
    @Column(name="is_active", nullable = false)       
    private Boolean isActive;
    @Column(name="is_email_verified")
    private Boolean isEmailVerified;
    @Column(name="email_verification_token")
    private String emailVerificationToken;
    @Column(name="password_reset_token")
    private String passwordResetToken;
    @CreationTimestamp
    @Column(name="created_at", nullable = false, updatable = false)
    private Timestamp createdAt;
    @UpdateTimestamp
    @Column(name="updated_at")
    private Timestamp updatedAt;
}
