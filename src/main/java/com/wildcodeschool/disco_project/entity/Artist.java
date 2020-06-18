package com.wildcodeschool.disco_project.entity;

import java.util.List;
import java.util.Map;

public class Artist {

    private Long artistId;
    private String artistName;

    public Artist(Long artistId, String artistName) {
        this.artistId = artistId;
        this.artistName = artistName;
    }

    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
//private List<Album> artistAlbums ;
    //private Map<Album,Track> artistAlbums;

    //  constructor
//    public Artist(List<Album> artistAlbums) {
//        this.artistAlbums = artistAlbums;
//    }

//    //  constructor
////    public Artist(Long artistId, String artistName, List<Album> artistAlbums) {
////        this.artistId = artistId;
////        this.artistName = artistName;
////        this.artistAlbums = artistAlbums;
////    }
////  getters
//    public Long getArtistId() { return artistId; }
//    public String getArtistName() { return artistName; }
//
//    public List<Album> getArtistAlbums() { return artistAlbums; }
//
//    //  setters
//    public void setArtistId(Long artistId) { this.artistId = artistId; }
//    public void setArtistName(String artistName) { this.artistName = artistName; }
//    public void setArtistAlbums(List<Album> artistAlbums) {this.artistAlbums = artistAlbums;}
}
