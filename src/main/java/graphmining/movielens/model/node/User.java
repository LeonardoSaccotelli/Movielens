package graphmining.movielens.model.node;

import graphmining.movielens.model.relationship.Rating;
import graphmining.movielens.model.relationship.Tag;
import lombok.*;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

import static graphmining.movielens.model.relationship.Rating.RATING_LINK_LABEL;
import static graphmining.movielens.model.relationship.Tag.TAG_LINK_LABEL;
import static org.neo4j.ogm.annotation.Relationship.INCOMING;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @Relationship(type = RATING_LINK_LABEL, direction = INCOMING)
    private Set<Rating> myRating = new HashSet<>();

    @Relationship(type = TAG_LINK_LABEL, direction = INCOMING)
    private Set<Tag> myTag = new HashSet<>();

    public void addNewRating (Rating rating) {
        this.myRating.add(rating);
    }

    public void addNewTag (Tag tag) {
        this.myTag.add(tag);
    }
}
