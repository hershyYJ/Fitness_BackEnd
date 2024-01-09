package com.Find.FitnessFriends.dto;

import com.Find.FitnessFriends.entity.BoardEntity;
import com.Find.FitnessFriends.entity.UserEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CommentDTO {
    private int commentId;
    private BoardEntity boardId;
    private UserEntity userId;
    private String content;
    private String deleteYn;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
