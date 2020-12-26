package graphmining.movielens.model.relationship;

import graphmining.movielens.model.node.Genre;
import graphmining.movielens.model.node.Movie;
import lombok.*;
import org.neo4j.ogm.annotation.*;


@RelationshipEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class BelongsToGenre {
    public static final String GENRE_LINK_LABEL = "BELONGS_TO_GENRE";

    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private Movie movie;

    @EndNode
    private Genre genre;
}
