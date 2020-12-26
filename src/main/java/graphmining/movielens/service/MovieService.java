package graphmining.movielens.service;

import graphmining.movielens.model.node.Movie;
import graphmining.movielens.model.node.User;
import graphmining.movielens.model.relationship.Rating;
import graphmining.movielens.repository.MovieRepository;
import graphmining.movielens.repository.UserRepository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;
    private final UserRepository userRepository;

    public MovieService(MovieRepository movieRepository, UserRepository userRepository) {
        this.movieRepository = movieRepository;
        this.userRepository = userRepository;
    }

    public List<Movie> findMovieByTitle(String text){
        return movieRepository.findMovieByTitle(text);
    }

    public List<Movie> findAllMovie (){
        return movieRepository.findAll();
    }
}
