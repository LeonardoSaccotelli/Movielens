package graphmining.movielens.model.relationship;

import graphmining.movielens.model.node.Movie;
import graphmining.movielens.model.node.User;
import lombok.*;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Tag {
    public static final String TAG_LINK_LABEL="TAG_BY";

    @Id
    @GeneratedValue
    private Long id;
    private String tag;
    private String date;

    @StartNode
    private Movie movie;

    @EndNode
    private User user;
}
