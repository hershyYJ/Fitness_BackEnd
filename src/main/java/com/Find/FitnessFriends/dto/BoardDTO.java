package com.Find.FitnessFriends.dto;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BoardDTO {
    private int boardId;
    private int userId;
    private String category;
    private String title;
    private String content;
    private String image;
    private int viewCount;
    private int likeCount;
    private String deleteYn;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
