package graphmining.movielens.repository;

import graphmining.movielens.model.node.Genre;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface GenreRepository extends Neo4jRepository<Genre, Long> {
}
