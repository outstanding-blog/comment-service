package com.amoylabs.blog.comment.controller;

import com.amoylabs.blog.comment.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class CommentsController {

    CommentsService commentsService;

    @GetMapping(value = "/v1/posts/{postId}/comments", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity loadComments(@PathVariable UUID postId) {
        return ResponseEntity.ok().body(commentsService.loadComments(postId));
    }

    @Autowired
    public void setCommentsService(CommentsService commentsService) {
        this.commentsService = commentsService;
    }
}