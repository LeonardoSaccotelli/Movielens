package graphmining.movielens.controller;

import graphmining.movielens.model.node.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import graphmining.movielens.service.MovieService;

import java.util.List;

@RestController
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/titlesByNameContains/{findTitle}")
    public List<Movie> findMovieByTitle(@PathVariable("findTitle") String findTitle){
        return movieService.findMovieByTitle(findTitle);
    }

    @GetMapping("/allMovies")
    public List<Movie> findAllMovies(){
        return movieService.findAllMovie();
    }
}
