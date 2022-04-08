package com.mycorp.movies.entity;

import java.util.List;

public class Movie {
    private long ID;
    private String sz_title;
    private int nb_copies;
    private String genre;
    private String mainActor;
    private List<String> otherActorList;

    public void setID(long ID_) {
        this.ID = ID_;
    }

    public String getSz_title() {
        return sz_title;
    }

    public void setSz_title(String sz_title) {
        this.sz_title = sz_title;
    }

    public int getNb_copies() {
        return nb_copies;
    }

    public void setNb_copies(int nb_copies) {
        this.nb_copies = nb_copies;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public List<String> getOtherActorList() {
        return otherActorList;
    }

    public void setOtherActorList(List<String> otherActorList) {
        this.otherActorList = otherActorList;
    }

    public void m_display() {
        System.out.println("title = " + this.sz_title);
        System.out.println("genre = " + this.genre);
        System.out.println("Main actor = " + this.mainActor);
        System.out.println("nb_copies = " + this.nb_copies);
        if (otherActorList != null && otherActorList.size() > 0) {
            for (int i = 0; i < otherActorList.size(); i++) {
                System.out.println("Actor [" + i + "] = " + otherActorList.get(i));
            }
        }
    }
}
