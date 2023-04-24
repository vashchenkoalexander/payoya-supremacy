package payoya.com.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import payoya.com.entity.Post;
import payoya.com.repository.IPostRepository;

import java.time.LocalDateTime;
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
        post.setTimeWhenPostWasCreated(LocalDateTime.now());
        if(post.getCountOfDislikes() == null && post.getCountOfLikes() == null){
            post.setCountOfDislike(0);
            post.setCountOfLikes(0);
        }
        return postRepository.save(post);
    }

    public List<Post> createPosts(List<Post> posts){
        posts.forEach(post -> post.setTimeWhenPostWasCreated(LocalDateTime.now()));
        return postRepository.saveAll(posts);
    }

    public Post getPostById(Long id){
        return postRepository.findById(id).orElse(null);
    }

    /**
    Sort By Likes from small to big (Asc sort)
     */
    public List<Post> sortByLikesAsc(){
        return postRepository.findAllByOrderByLikesAsc();
    }

    /**
    Sort By Likes from big to small (Desk sort)
     */
    public List<Post> sortByLikesDesc(){
        return postRepository.findAllByOrderByLikesDesc();
    }

    /**
    Sort By TimeWhenPostWasCreated from small to big (Asc sort)
     */
    public List<Post> sortByTimeWhenPostWasCreatedAsc(){
        return postRepository.findAllByOrderByTimeWhenPostWasCreatedAsc();
    }

    /**
    Sort By TimeWhenPostWasCreated from big to small (Desc sort)
     */
    public List<Post> sortByTimeWhenPostWasCreatedDesc(){
        return postRepository.findAllByOrderByTimeWhenPostWasCreatedDesc();
    }


    /**
    Returning true if post entity with that id exists in db
    else return false
     */
    public boolean deleteById(Long id) {
        if(postRepository.existsById(id)){
            postRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
