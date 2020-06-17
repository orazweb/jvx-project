package com.wildcodeschool.disco_project.entity;

import java.util.List;

public class Album {

    private Long id;
    private String title;
    private Long year;
    private String label;
    private String artistName;
    private List<Track> tracks;


    //  constructor
    public Album(Long id_album, String title, Long year, String label, String artistName, Long artist_id) {
    }

    public Album(Long id, String title, Long year, String label, String artistName, List<Track> tracks) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.label = label;
        this.artistName = artistName;
        this.tracks = tracks;
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

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}
