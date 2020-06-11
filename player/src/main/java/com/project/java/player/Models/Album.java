package com.project.java.player.Models;

public class Album {
    private int id;
    private String title;
    private int year;
    private int label_id;
    private int artist_id;

    public Album(int id, String title, int year, int label_id, int artist_id) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.label_id = label_id;
        this.artist_id = artist_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLabel_id() {
        return label_id;
    }

    public void setLabel_id(int label_id) {
        this.label_id = label_id;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }
}
