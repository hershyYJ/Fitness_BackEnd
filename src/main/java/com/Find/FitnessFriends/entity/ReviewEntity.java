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
@Table(name = "Review")
public class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int reviewId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity userId;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "content")
    private String content;

    @Column(name = "image")
    private String image;

    @Column(name = "created_At")
    private LocalDateTime createdAt;

    @Column(name = "updated_At")
    private LocalDateTime updatedAt;
}
