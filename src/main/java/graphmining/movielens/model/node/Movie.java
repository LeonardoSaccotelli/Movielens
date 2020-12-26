package graphmining.movielens.model.node;

import graphmining.movielens.model.relationship.BelongsToGenre;
import graphmining.movielens.model.relationship.Rating;
import graphmining.movielens.model.relationship.Tag;
import lombok.*;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;


import java.util.HashSet;
import java.util.Set;

import static graphmining.movielens.model.relationship.BelongsToGenre.GENRE_LINK_LABEL;
import static graphmining.movielens.model.relationship.Rating.RATING_LINK_LABEL;
import static graphmining.movielens.model.relationship.Tag.TAG_LINK_LABEL;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Movie {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @Relationship(type = RATING_LINK_LABEL)
    private Set<Rating> ratedBy = new HashSet<>();

    @Relationship(type = TAG_LINK_LABEL)
    private Set<Tag> taggedBy = new HashSet<>();

    @Relationship(type = GENRE_LINK_LABEL)
    private Set<BelongsToGenre>  genres = new HashSet<>();

    public void addNewRating (Rating rating) {
        this.ratedBy.add(rating);
    }

    public void addNewTag (Tag tag) {
        this.taggedBy.add(tag);
    }

    public void addNewGenre (BelongsToGenre genre) {
        this.genres.add(genre);
    }
}
