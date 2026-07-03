package com.codewithsash.movies;

// MovieController -->  sending response to API layer

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/movies")

public class MovieController {

  @Autowired
  private MovieService movieService;

  @GetMapping
  public ResponseEntity<List<Movie>> getAllMovies() {
    return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
  }

  @GetMapping("/{imdbId}") // search a movie by id
  public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId) { //whatever comes from the path, we want to convert that to an string called imdbId
    return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId), HttpStatus.OK);
  }
  
}
