package com.codewithsash.movies;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Document(collection = "movies") //so the framework knows that this class documents each movie
@Data // takes care of all the getters and setter methods
@AllArgsConstructor // a constructor that takes all the private fields as arguments
@NoArgsConstructor // a constructor that takes no parameters at all

public class Movie {

  @Id // so the object id is treated as the unique id
  private ObjectId id;

  private String title;
  
  private String releaseDate;

  private String imdbId;

  private String trailerLink;

  private String poster;

  private List<String> genres;
  
  private List<String> backdrops;

  @DocumentReference // the database will only store the id of the reviews and the review will be in a separate collection
  private List<Review> reviewIds;
  
}
