package payoya.com.controller;

import org.springframework.web.bind.annotation.*;
import payoya.com.entity.Post;
import payoya.com.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class PostRestController {

    private final PostService postService;

    public PostRestController(PostService postService) {

        this.postService = postService;
    }

    @GetMapping("posts")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @PostMapping("posts")
    public Post createNewPost(@RequestBody Post post){
        return postService.createPost(post);
    }

    @PostMapping("postss")
    public List<Post> createNewPosts(@RequestBody List<Post> posts){
        return postService.createPosts(posts);
    }

    @GetMapping("post/{id}")
    public Post getPostById(@PathVariable Long id){
        return postService.getPostById(id);
    }

}
