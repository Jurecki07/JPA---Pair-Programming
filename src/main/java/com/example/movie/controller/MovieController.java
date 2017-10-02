package com.example.movie.controller;


import com.example.movie.domain.Movie;
import com.example.movie.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieServiceImpl movieService;


    @GetMapping("/movies")
    public List<Movie> getMovies(){
        return movieService.get();
    }

    @PostMapping("/movies")
        public Movie addMovie(){
        movieService.add(movie)

    }


}
