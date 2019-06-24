package com.example.movieinfoservice.rest.controllers;

import com.example.movieinfoservice.model.Movie;
import com.example.movieinfoservice.wrapper.MoviesList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MoviesController {

    @GetMapping("/movies")
    public MoviesList getAllMovies() {
        MoviesList moviesList = new MoviesList();
        List<Movie> movies = new ArrayList<Movie>();

        Movie movie1 = new Movie("aaa001", "Star Wars", 1977);
        Movie movie2 = new Movie("aaa002", "Alien", 1979);
        Movie movie3 = new Movie("aaa003", "Blade Runner", 1982);
        Movie movie4 = new Movie("aaa004", "The Terminator", 1984);
        Movie movie5 = new Movie("aaa005", "Predator", 1987);

        Movie movie6 = new Movie("aaa006", "Point Break", 1991);
        Movie movie7 = new Movie("aaa007", "Dracula", 1992);
        Movie movie8 = new Movie("aaa008", "Jurassic Park", 1993);
        Movie movie9 = new Movie("aaa009", "Gladiator", 2000);
        Movie movie10 = new Movie("aaa010", "The Illusionist", 2006);

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);

        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);

        moviesList.setMoviesList(movies);
        return moviesList;
    }

}
