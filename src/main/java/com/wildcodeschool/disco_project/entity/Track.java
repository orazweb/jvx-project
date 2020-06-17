package com.wildcodeschool.disco_project.entity;

public class Track {

    private Long id;
    private int number;
    private String name;
    private String artistName;
    private String genre;
    private String duration;
    private int year;
    private String albumName;

    public Track(Long id, int number,
                 String name, String artistName,
                 String genre, String duration,
                 int year, String albumName) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.artistName = artistName;
        this.genre = genre;
        this.duration = duration;
        this.year = year;
        this.albumName = albumName;
    }

    public Long getId() {
        return id;
    }
    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public String getArtistName() {
        return artistName;
    }
    public String getGenre() {
        return genre;
    }
    public String getDuration() {
        return duration;
    }
    public int getYear() {
        return year;
    }
    public String getAlbumName() {
        return albumName;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

}
