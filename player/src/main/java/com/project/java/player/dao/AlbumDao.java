package com.project.java.player.dao;

import com.project.java.player.Models.Album;

import java.util.List;

public interface AlbumDao {

    List<Album> findAll();
}
