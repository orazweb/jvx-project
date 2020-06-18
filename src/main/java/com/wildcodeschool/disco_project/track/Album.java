package com.wildcodeschool.disco_project.track;

import java.util.List;

public class Album {


//    private String albumArtist;
    private String albumTitle;
    private List<Track> trackList;


    public Album(String albumTitle, List<Track> trackList) {
        this.albumTitle = trackList.get(0).getAlbumTitle();
        this.trackList = trackList;
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }
}
