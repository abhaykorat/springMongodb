package com.example.springMongodb.Resource;

import com.example.springMongodb.Models.Comment;
import com.example.springMongodb.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comment")
public class CommentResource {
    @Autowired
    private CommentService commentService;
    @PostMapping
    public Comment saveComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }

    @GetMapping("/getall")
    public List<Comment> getallComments(){
        return commentService.getallComments();
    }

    @GetMapping
    public List<Comment> getCommentById(@RequestParam(name = "commentId") Comment commentId){
        return commentService.getCommentById(commentId);
    }
    @PutMapping
    public Comment updateComment(@RequestBody Comment comment){
        return commentService.updateComment(comment);
    }

    @DeleteMapping
    public void deleteComment(@RequestParam(name = "commentId") String commentId){
        commentService.deleteComment(commentId);
    }


}
