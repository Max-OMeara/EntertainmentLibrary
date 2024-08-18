package dev.mxomeara.entertainment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data //takes care of getters and setters auto
@AllArgsConstructor //creates constructor that takes all fields as arg
@NoArgsConstructor //creates constructor that takes no fields
public class Movie {
    //make all properties for the movie db

    @Id //unique id for each movie
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trialerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference //makes it a manual reference relationship which stores only the id
    private List<Review> reviewIds; //embedded relationship
}
//To use movie class we need a service class and a repository class