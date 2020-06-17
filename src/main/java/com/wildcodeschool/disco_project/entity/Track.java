package com.wildcodeschool.disco_project.entity;

public class Track {

    private Long id;
    private String title;
    private Long artist_id;
    private String genre_id;
    private String album;

    public Track(Long id, int number, String name, String artistName, String genre, String duration, int year, String albumName) {
    }

    public Track(Long id, String title, Long artist_id, String genre_id, String album) {
        this.id = id;
        this.title = title;
        this.artist_id = artist_id;
        this.genre_id = genre_id;
        this.album = album;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(Long artist_id) {
        this.artist_id = artist_id;
    }

    public String getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(String genre_id) {
        this.genre_id = genre_id;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}