package graphmining.movielens.service;

import graphmining.movielens.model.node.Movie;
import graphmining.movielens.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findMovieByTitle(String text){
        return movieRepository.findMovieByTitle(text);
    }

    public List<Movie> findAllMovie (){
        return movieRepository.findAll();
    }
}
