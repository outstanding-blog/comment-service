package com.amoylabs.blog.comment.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Setter
@Getter
public class Comment {
    private UUID postId;
    private UUID commentId;
    private UUID userId;
    private String content;
    private Date createdDate;
}
