package com.wildcodeschool.disco_project.track;

import java.util.List;

public class Artist {

    private List<Album> albumList;

    public Artist(List<Album> albumList) {
        this.albumList = albumList;
    }

    public List<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }
}
