package com.example.movieinfoservice.wrapper;

import com.example.movieinfoservice.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MoviesList {

    private List<Movie> moviesList;

    public MoviesList() {
        this.moviesList = new ArrayList<>();
    }

    public List<Movie> getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }
}
