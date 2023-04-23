package payoya.com.service;

import org.springframework.stereotype.Service;
import payoya.com.entity.Comment;
import payoya.com.repository.ICommentRepository;

import java.util.List;

@Service
public class CommentService {

    private ICommentRepository commentRepository;

    public CommentService(ICommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> getAllComments(){
        return commentRepository.findAll();
    }

    public Comment createNewComment(Comment comment){
        return commentRepository.save(comment);
    }
}
