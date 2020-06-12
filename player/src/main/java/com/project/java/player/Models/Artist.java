package com.project.java.player.Models;

public class Artist {
    private int id;
    private String artist_name;
    private String artist_bio;
    private String artist_picture;

    public Artist() {

    }

    public Artist(int id, String artist_name, String artist_bio, String artist_picture) {
        this.id = id;
        this.artist_name = artist_name;
        this.artist_bio = artist_bio;
        this.artist_picture = artist_picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getArtist_bio() {
        return artist_bio;
    }

    public void setArtist_bio(String artist_bio) {
        this.artist_bio = artist_bio;
    }

    public String getArtist_picture() {
        return artist_picture;
    }

    public void setArtist_picture(String artist_picture) {
        this.artist_picture = artist_picture;
    }
}
