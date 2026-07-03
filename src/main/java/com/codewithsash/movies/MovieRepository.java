package com.codewithsash.movies;

// MovieRepo --> talks with the database

import org.springframework.stereotype.Repository;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
  
}
