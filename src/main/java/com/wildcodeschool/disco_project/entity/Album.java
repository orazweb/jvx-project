package com.wildcodeschool.disco_project.entity;

import java.util.List;

public class Album{

    private Long albumId;
    private String albumTitle;
    private String albumYear;
    private String label;
    private String artistName;
    //private List<Track> albumTracks;

    //  constructor
    public Album() { }

    //  constructor

    public Album(Long albumId, String albumTitle, String albumYear, String label, String artistName) {
        this.albumId = albumId;
        this.albumTitle = albumTitle;
        this.albumYear = albumYear;
        this.label = label;
        this.artistName = artistName;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getAlbumYear() {
        return albumYear;
    }

    public void setAlbumYear(String albumYear) {
        this.albumYear = albumYear;
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

    //    public Album(Long albumId, String albumTitle, String albumYear, String label, String artistName, List<Track> albumTracks) {
//        this.albumId = albumId;
//        this.albumTitle = albumTitle;
//        this.albumYear = albumYear;
//        this.label = label;
//        this.artistName = artistName;
//        this.albumTracks = albumTracks;
//    }
//
//    // getters
//    public Long getAlbumId() { return albumId;}
//    public String getAlbumTitle() { return albumTitle; }
//    public String getAlbumYear() { return albumYear; }
//    public String getLabel() { return label; }
//    public String getArtistName() { return artistName; }
//
//    public List<Track> getAlbumTracks() { return albumTracks; }
//
//    // setters
//    public void setAlbumId(Long albumId) { this.albumId = albumId; }
//    public void setAlbumTitle(String albumTitle) { this.albumTitle = albumTitle; }
//    public void setAlbumYear(String albumYear) { this.albumYear = albumYear; }
//    public void setLabel(String label) { this.label = label; }
//    public void setArtistName(String artistName) { this.artistName = artistName; }
//    public void setAlbumTracks(List<Track> albumTracks) { this.albumTracks = albumTracks; }
}
