package graphmining.movielens.controller;

import graphmining.movielens.model.node.User;
import graphmining.movielens.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/findUserById/{id}")
    public User findUserById(@PathVariable("id") String id){
        return userService.findUserById(Long.valueOf(id));
    }

    @GetMapping("/allUser")
    public List<User> allUser(){
        return userService.allUser();
    }
}
