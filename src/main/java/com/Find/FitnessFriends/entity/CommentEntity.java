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
@Table(name = "Comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int commentId;

    @ManyToOne
    @JoinColumn(name = "board_id", referencedColumnName = "id")
    private BoardEntity boardId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")   // 댓글 작성자 id
    private UserEntity userId;

    @Column(name = "content")
    private String content;

    @Column(name = "delete_yn")
    private String deleteYn;

    @Column(name = "created_At")
    private LocalDateTime createdAt;

    @Column(name = "updated_At")
    private LocalDateTime updatedAt;
}

