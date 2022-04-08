package com.mycorp.movies.repository;

import com.mycorp.movies.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    private static List<Movie> movieList = new ArrayList<>();

    public void add(Movie movie) {
        movieList.add(movie);
        System.out.println("Movie has been added : " + movie.getSz_title());
    }

    public List<Movie> getMovieList() {
        return movieList;
    }
}
