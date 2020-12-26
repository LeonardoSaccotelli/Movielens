package graphmining.movielens.model.node;

import graphmining.movielens.model.relationship.BelongsToGenre;
import lombok.*;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

import static graphmining.movielens.model.relationship.BelongsToGenre.GENRE_LINK_LABEL;
import static org.neo4j.ogm.annotation.Relationship.INCOMING;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Genre {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @Relationship(type = GENRE_LINK_LABEL, direction = INCOMING)
    private Set<BelongsToGenre> movies = new HashSet<>();

    public void addMovie (BelongsToGenre movie){
        this.movies.add(movie);
    }

}