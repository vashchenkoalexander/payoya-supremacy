package payoya.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import payoya.com.entity.Post;

@Repository
public interface IPostRepository extends JpaRepository<Post, Long> {
}
