package payoya.com.controller;

import org.springframework.web.bind.annotation.*;
import payoya.com.entity.Comment;
import payoya.com.service.CommentService;

import java.util.List;

@RestController
@RequestMapping("/v1/comment")
public class CommentRestController {

    private CommentService commentService;

    public CommentRestController(CommentService commentService){
        this.commentService = commentService;
    }

    @GetMapping("all")
    public List<Comment> getAllComments(){
        return commentService.getAllComments();
    }

    @PostMapping("new")
    public Comment createNewComment(@RequestBody Comment comment){
        return commentService.createNewComment(comment);
    }

}


