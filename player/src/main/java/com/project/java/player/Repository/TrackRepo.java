package com.project.java.player.Repository;

import com.project.java.player.Models.Track;
import com.project.java.player.dao.TrackDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TrackRepo implements TrackDao {
    @Override
    public List<Track> findAll(){
        List<Track> trackList = new ArrayList<>();
        trackList.add(new Track(1, "Beat It", 1, 10, 4, 10, 1, 1990));
        return trackList;
    }


}

