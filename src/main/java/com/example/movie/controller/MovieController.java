package com.example.movie.controller;


import com.example.movie.domain.Movie;
import com.example.movie.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        public Movie addMovie(@RequestBody Movie movie){
        return movieService.add(movie);

    }

    @PutMapping("/movies")
    public Movie updateMovie(@RequestBody Movie movie){
            return movieService.update(movie);

    }
@DeleteMapping("/movies")
    public void deleteMovie (@RequestParam Integer id){
        movieService.delete(id);
}

}
