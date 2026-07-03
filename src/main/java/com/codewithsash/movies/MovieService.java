package com.codewithsash.movies;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

  @Autowired
  private MovieRepository movieRepository;

  public List<Movie> allMovies() {
    return movieRepository.findAll();
  }

  public Optional<Movie> singleMovie(String imdbId) { //optional --> if the id is null
    return movieRepository.findByImdbId(imdbId);
  }
}
