package com.Find.FitnessFriends.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Matching")
public class MatchingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int matchingId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "career_options")
    private String careerOptions;

    @Column(name = "gender_options")
    private String genderOptions;

    @Column(name = "age_options")
    private int ageOptions;

    @Column(name = "time_options")
    private String timeOptions;
}
