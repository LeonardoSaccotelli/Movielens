package graphmining.movielens.repository;

import graphmining.movielens.model.node.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;


public interface UserRepository extends Neo4jRepository<User,Long> {
    @Query("MATCH (u:User {id:'Id'}) RETURN u")
    User findOneUserById (Long Id);
}
