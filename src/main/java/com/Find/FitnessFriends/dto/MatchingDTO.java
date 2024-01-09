package com.Find.FitnessFriends.dto;

import com.Find.FitnessFriends.entity.UserEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class MatchingDTO {
    private int matchingId;
    private UserEntity userId;
    private String careerOptions;
    private String genderOptions;
    private int ageOptions;
    private String timeOptions;
}
