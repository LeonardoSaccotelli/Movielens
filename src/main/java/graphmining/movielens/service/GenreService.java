package graphmining.movielens.service;

import graphmining.movielens.model.node.Genre;
import graphmining.movielens.repository.GenreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {
    private final GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public List<Genre> findAllGenre (){
        return genreRepository.findAll();
    }

}
