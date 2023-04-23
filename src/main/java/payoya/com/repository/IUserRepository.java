package payoya.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import payoya.com.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {

}
