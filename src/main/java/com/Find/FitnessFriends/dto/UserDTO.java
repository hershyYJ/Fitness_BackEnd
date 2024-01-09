package com.Find.FitnessFriends.dto;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserDTO {
    private int userId;
    private String userEmail;
    private String userPassword;
    private String userNickname;
    private String userPhoneNumber;
    private String userRegion;
    private String userCareer;
    private String userGender;
    private int userAge;
    private String userWorkoutTime;
    private String userProfileImage;
}
