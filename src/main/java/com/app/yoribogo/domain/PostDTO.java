package com.app.yoribogo.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PostDTO {
    private Long id;
    private String postTitle;
    private String postContent;
    private String postDate;
    private Long postViewCount;
    private Long postLikeCount;
    private Long postCommentCount;
    private String postImagePath;
    private String memberId;
    private String categoryCId;
    private String memberName;
}