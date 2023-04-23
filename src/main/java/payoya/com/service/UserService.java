package payoya.com.service;

import org.springframework.stereotype.Service;
import payoya.com.entity.User;
import payoya.com.repository.IUserRepository;

import java.util.List;

@Service
public class UserService {
    private IUserRepository userRepository;


    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User createNewUser(User user){
        return userRepository.save(user);
    }


}
