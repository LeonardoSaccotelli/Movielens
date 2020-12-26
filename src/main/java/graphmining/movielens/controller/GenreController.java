package graphmining.movielens.controller;

import graphmining.movielens.model.node.Genre;
import graphmining.movielens.service.GenreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GenreController {
    private final GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping("/allGenres")
    public List<Genre> findAllGenre(){
        return genreService.findAllGenre();
    }
}
