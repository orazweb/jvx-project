package com.wildcodeschool.disco_project.DAO;

import com.wildcodeschool.disco_project.entity.Track;

import java.util.List;

public interface TrackDao<T> {

    List<T> findAllTracksByIdAlbum(Long album_id);

}


