package graphmining.movielens.service;

import graphmining.movielens.model.node.Movie;
import graphmining.movielens.model.node.User;
import graphmining.movielens.repository.UserRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserById(Long id){
        return this.userRepository.findOneUserById(id);
    }

    public List<User> allUser() {
        return userRepository.findAll();
    }
}
