package com.example.springMongodb.Service;

import com.example.springMongodb.Models.Comment;
import com.example.springMongodb.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(Comment comment){
        return commentRepository.save(comment);
    }

    public List<Comment> getallComments() {
        return commentRepository.findAll();
    }

    public List<Comment> getCommentById(Comment commentId) {
        Example<Comment> c = Example.of(commentId);
        return commentRepository.findAll(c);
    }

    public Comment updateComment(Comment comment){
        return commentRepository.save(comment);
    }

    public void deleteComment(String commentId){
        commentRepository.deleteById(commentId);
    }


}
