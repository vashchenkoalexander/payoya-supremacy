package payoya.com.controller;

import org.springframework.web.bind.annotation.*;
import payoya.com.entity.User;
import payoya.com.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/v1/user/")
public class UserRestController {

    private final UserService userService;


    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("all")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("new")
    public User createNewUser(@RequestBody User user){
        return userService.createNewUser(user);
    }
}
