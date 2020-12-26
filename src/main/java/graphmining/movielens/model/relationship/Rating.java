package graphmining.movielens.model.relationship;

import graphmining.movielens.model.node.Movie;
import graphmining.movielens.model.node.User;
import lombok.*;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Rating {
    public static final String RATING_LINK_LABEL = "RATED_BY";

    @Id
    @GeneratedValue
    private Long id;
    private String rating;
    private String date;

    @StartNode
    private Movie movie;

    @EndNode
    private User user;
}
