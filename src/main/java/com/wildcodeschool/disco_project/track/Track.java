package com.wildcodeschool.disco_project.track;


public class Track {
/*
*  - track number
*  - track title
*  - track artist
*  - track album
*  - track year
*  - track genre
*  - track duration
*  - track path
*/
    // attributes
    private String number,
                    title,
                    artist,
        albumTitle,
                    year,
                    genre,
                    duration,
                    path;

    // constructor
    public Track(){

    }

    public Track(String number, String title, String artist, String albumTitle, String year, String genre, String duration, String path) {
        this.number = number;
        this.title = title;
        this.artist = artist;
        this.albumTitle = albumTitle;
        this.year = year;
        this.genre = genre;
        this.duration = duration;
        this.path = path;
    }

    // getters
    public String getNumber() { return number; }
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getAlbumTitle() { return albumTitle; }
    public String getYear() { return year; }
    public String getGenre() { return genre; }
    public String getDuration() { return duration; }
    public String getPath() { return path; }

    // setters
    public void setNumber(String number) { this.number = number; }
    public void setTitle(String title) { this.title = title; }
    public void setArtist(String artist) { this.artist = artist; }
    public void setAlbumTitle(String albumTitle) { this.albumTitle = albumTitle; }
    public void setYear(String year) { this.year = year; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setDuration(String duration) { this.duration = duration; }
    public void setPath(String path) { this.path = path; }
}
