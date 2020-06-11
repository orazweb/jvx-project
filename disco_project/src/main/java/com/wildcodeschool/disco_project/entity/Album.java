package com.wildcodeschool.disco_project.entity;

public class Album {

    private int id;
    private String title;
    private int year;
    private int artist_id;

    //  constructor
    public Album() { }

    //  constructor
    public Album(int id, String title, int year, int artist_id) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.artist_id = artist_id;
    }

    // getters
    public int getId() { return id;}
    public String getTitle() { return title; }
    public int getYear() { return year; }
    public int getArtist_id() { return artist_id; }
    // setters
    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setYear(int year) { this.year = year; }
    public void setArtist_id(int artist_id) { this.artist_id = artist_id; }

}
