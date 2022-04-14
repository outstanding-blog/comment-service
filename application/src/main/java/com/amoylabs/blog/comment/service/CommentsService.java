package com.amoylabs.blog.comment.service;

import com.amoylabs.blog.comment.model.Comment;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

@Service
public class CommentsService {

    public List<Comment> loadComments(UUID postId) {
        return Arrays.asList(
                mockComment(postId, "Comment 1"),
                mockComment(postId, "Comment 2"),
                mockComment(postId, "Comment 3")
        );
    }

    private Comment mockComment(UUID postId, String content) {
        Comment comment = new Comment();
        comment.setCommentId(UUID.randomUUID());
        comment.setPostId(postId);
        comment.setUserId(UUID.fromString("cf11cb49-bf00-4d46-b689-1a50cd05a241"));
        comment.setContent(content);
        comment.setCreatedDate(Calendar.getInstance().getTime());
        return comment;
    }

}
