package com.wildcodeschool.disco_project.repository;

import com.wildcodeschool.disco_project.entity.Album;

import java.util.List;

public interface DiscoDao<T> {

    T findById(Long id);

    List<T> findAll();

    List<T> findAlbumsByArtistId(Long id);

    List<T> findTracksByAlbumId(Long id);

}
