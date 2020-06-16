package com.wildcodeschool.disco_project.DAO;

import com.wildcodeschool.disco_project.entity.Album;

import java.util.List;

public interface AlbumDao<T> {

    List<Album> findAllAlbums();

    List<Album> findAllAlbumsByIdArtist(Long artist_id);
}
