package graphmining.movielens.repository;

import graphmining.movielens.model.node.Movie;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.List;

public interface MovieRepository extends Neo4jRepository<Movie,Long> {

    @Query("MATCH (m:Movie {name:'$text'}) RETURN m")
    List<Movie> findMovieByTitle (String text);
}
