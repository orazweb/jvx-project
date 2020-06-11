package com.project.java.player.Models;

public class Track {
    private int id;
    private String name;
    private int track_number;
    private int artist_id;
    private int style;
    private int album_id;
    private int album_label;
    private int year;

    public Track(){

    }

    public Track(int id, String name, int track_number, int artist_id, int style, int album_id, int album_label,  int year) {
        this.id = id;
        this.name = name;
        this.track_number = track_number;
        this.artist_id = artist_id;
        this.style = style;
        this.album_id = album_id;
        this.album_label = album_label;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTrack_number() {
        return track_number;
    }

    public void setTrack_number(int track_number) {
        this.track_number = track_number;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }

    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }

    public int getAlbum_label() {
        return album_label;
    }

    public void setAlbum_label(int album_label) {
        this.album_label = album_label;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
