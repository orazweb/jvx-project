package com.wildcodeschool.disco_project.DAO;

import com.wildcodeschool.disco_project.entity.Artist;

import java.util.List;

public interface ArtistDao<T> {
    List<T> findAllArtists();

   T findArtistById(Long id);
}
