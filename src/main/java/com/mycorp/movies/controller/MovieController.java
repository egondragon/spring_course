package com.mycorp.movies.controller;

import com.mycorp.movies.entity.Movie;
import com.mycorp.movies.service.MovieService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieController {
    public void createMovieEntry(MovieService svc) {
        Movie movie = new Movie();

        Scanner sc = new Scanner(System.in);

        System.out.println("Movie title: ");
        String sz_title = sc.nextLine();

        movie.setSz_title(sz_title);

        System.out.println("How many copies ? ");
        int nb_copies = Integer.valueOf(sc.nextLine());
        movie.setNb_copies(nb_copies);

        System.out.println("Film genre ? ");
        String sz_genre = sc.nextLine();

        movie.setGenre(sz_genre);

        System.out.println("Who is the main actor ? ");
        String sz_mainActor = sc.nextLine();

        movie.setMainActor(sz_mainActor);

        System.out.println("Is there any other actors ? ");
        String resp = sc.nextLine();
        if (resp.charAt(0) == 'y') {
            List<String> otherActorList = new ArrayList<String>();
            System.out.println("Enter actor names (q to end) ? ");
            String sz_otherActor = sc.nextLine();
            while (sz_otherActor.length() > 1 && sz_otherActor.charAt(0) != 'q') {
                otherActorList.add(sz_otherActor);
                sz_otherActor = sc.nextLine();
            }
            movie.setOtherActorList(otherActorList);
        }
        svc.addMovieEntry(movie);
    }

    public void listMovies(MovieService ms) {
        ms.dump();
    }
}
