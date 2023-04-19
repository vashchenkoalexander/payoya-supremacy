package payoya.com.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import payoya.com.entity.Post;
import payoya.com.repository.IPostRepository;

import java.util.List;

@Service
public class PostService {


    private final IPostRepository postRepository;

    public PostService(IPostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public Post createPost(Post post){
        return postRepository.save(post);
    }

    public List<Post> createPosts(List<Post> posts){
        return postRepository.saveAll(posts);
    }

    public Post getPostById(Long id){
        return postRepository.findById(id).orElse(null);
    }

    public boolean deleteById(Long id) {
        if(postRepository.existsById(id)){
            postRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
