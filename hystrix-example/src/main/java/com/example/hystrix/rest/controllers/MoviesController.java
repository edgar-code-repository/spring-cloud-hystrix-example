package com.example.hystrix.rest.controllers;

import com.example.hystrix.model.Movie;
import com.example.hystrix.wrapper.MoviesList;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MoviesController {

    @GetMapping("/movies")
    @HystrixCommand(fallbackMethod = "getDefaultMoviesList")
    public List<Movie> getAllMovies() {
        RestTemplate restTemplate = new RestTemplate();

        MoviesList response;
        response = restTemplate.getForObject("http://localhost:5501/movies", MoviesList.class);

        List<Movie> movies = response.getMoviesList();

        return movies;
    }

    public List<Movie> getDefaultMoviesList() {
        List<Movie> movies = new ArrayList<Movie>();

        Movie movie1 = new Movie("aaa101", "Venom", 2018);
        Movie movie2 = new Movie("aaa102", "Arrival", 2016);
        Movie movie3 = new Movie("aaa103", "The Martian", 2015);

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        return movies;
    }

}
