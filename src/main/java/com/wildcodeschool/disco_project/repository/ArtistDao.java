package com.wildcodeschool.disco_project.repository;

import com.wildcodeschool.disco_project.entity.Artist;

import java.util.List;

public interface ArtistDao<T> {
    List<T> findAllArtists();
    T findArtistById(Long id);
}
