package com.codewithsash.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class MoviesApplication {

    public static void main(String[] args) {
        // Load .env file from project root
        Dotenv dotenv = Dotenv.configure()
            .directory("./")  // Project root directory
            .filename(".env") // .env file name
            .ignoreIfMissing() // Don't crash if .env doesn't exist
            .load();
        
        // Set each .env entry as a System Property
        dotenv.entries().forEach(entry -> {
            System.setProperty(entry.getKey(), entry.getValue());
        });
        
        SpringApplication.run(MoviesApplication.class, args);
    }
}