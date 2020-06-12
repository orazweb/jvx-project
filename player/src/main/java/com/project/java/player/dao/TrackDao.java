package com.project.java.player.dao;

import com.project.java.player.Models.Album;
import com.project.java.player.Models.Artist;
import com.project.java.player.Models.Track;

import java.util.List;

public interface TrackDao {

    List<Track> findAll();
}

