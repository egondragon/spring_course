package com.mycorp.movies.service;

import com.mycorp.movies.entity.Movie;
import com.mycorp.movies.repository.MovieRepository;

import java.util.List;

public class MovieService {
    private static long movieID = 0l;
    private MovieRepository movieRepository = new MovieRepository();

    public void addMovieEntry(Movie movie) {
        movie.setID(movieID);
        movieRepository.add(movie);
    }

    public void dump() {
        List<Movie> ml = movieRepository.getMovieList();
        for (int i = 0; i < ml.size(); i++) {
            ml.get(i).m_display();
        }
    }
}
