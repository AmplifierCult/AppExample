package com.example.demo.controller;

import com.example.demo.model.Comment;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private static Comment generateComment(){
        Comment result = new Comment();
        result.setPhoto(null);
        result.setAuthor(null);
        result.setContent("Nice photo");
        return result;
    }
    @GetMapping
    public List<Comment> getAllComments() {
        return List.of(generateComment(),generateComment());
    }
}
