package payoya.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import payoya.com.entity.Post;

import java.util.List;

@Repository
public interface IPostRepository extends JpaRepository<Post, Long> {
    //TODO Sort by likes, timeWhenPostWasCreated.
//    List<Post> findPostsByLikesAndBodyAndOrderByLikesAsc();
//
//    List<Post>  findPostsByLikesAndBodyAndOrderByLikesDesc();
//
//    List<Post> findPostsByTimeWhenPostWasCreatedAndBodyAndOrderByTimeWhenPostWasCreatedAsc();
//    List<Post> findPostsByTimeWhenPostWasCreatedAndBodyAndOrderByTimeWhenPostWasCreatedDesc();

    List<Post> findAllByOrderByLikesAsc();

    List<Post> findAllByOrderByLikesDesc();

    List<Post> findAllByOrderByTimeWhenPostWasCreatedAsc();

    List<Post> findAllByOrderByTimeWhenPostWasCreatedDesc();

}
