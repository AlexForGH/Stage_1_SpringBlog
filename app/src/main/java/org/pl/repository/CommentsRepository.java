package org.pl.repository;

import org.pl.model.Comment;

import java.util.List;

public interface CommentsRepository {
    List<Comment> getCommentsByPostId(Long postId);
    Comment getCommentById(Long id);
    void addComment(Comment comment);
    void editComment(Comment comment);
    void deleteCommentById(Long id);
}
