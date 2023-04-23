package payoya.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import payoya.com.entity.Comment;

@Repository
public interface ICommentRepository extends JpaRepository<Comment, Long> {
}
