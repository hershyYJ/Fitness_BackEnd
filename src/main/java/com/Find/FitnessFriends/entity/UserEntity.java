package com.Find.FitnessFriends.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "User")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int userId;

    @Column(name = "email")
    private String userEmail;

    @Column(name = "password")
    private String userPassword;

    @Column(name = "phone_number")
    private String userPhoneNumber;

    @Column(name = "region")
    private String userRegion;

    @Column(name = "career")
    private String userCareer;

    @Column(name = "gender")
    private String userGender;

    @Column(name = "age")
    private int userAge;

    @Column(name = "workout_time")
    private String userWorkoutTime;

    @Column(name = "profile_image")
    private String userProfileImage;

    @Column(name = "created_At")
    private LocalDateTime createdAt;

    @Column(name = "updated_At")
    private LocalDateTime updatedAt;
}

