package com.example.movie.service;

import com.example.movie.domain.Movie;
import com.example.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

// you have to implememt the methods this was done automatically
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;


    @Override
    public Movie add(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie get(int id) {
        return null;
    }

    @Override
    public List<Movie> get() {
        return null;
    }

    @Override
    public Movie update(Movie movie) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
