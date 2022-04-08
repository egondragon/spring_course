package com.mycorp.movies;

import com.mycorp.movies.controller.MovieController;
import com.mycorp.movies.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        MovieController mc = new MovieController();
        MovieService svc = new MovieService();

        System.out.println( "Hi, press 1 to add a movie, 0 to esc" );
        Scanner sc = new Scanner(System.in);
        int c = 9;
        while (c != 0) {
            c = sc.nextInt();
            switch (c) {
                case 1:
                    mc.createMovieEntry(svc);
                    break;
                case 2:
                    mc.listMovies(svc);
                    break;
            }
        }
    }
}
