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
        trackList.add(new Track(1, "Beat It", 1, 10, 1, 10, 1, 1990));
        trackList.add(new Track(2, "Thunderstruck", 1, 11, 3, 11, 2, 1990));
        trackList.add(new Track(1, "Amerika", 3, 12, 3, 12, 3, 2004));
        trackList.add(new Track(1, "Me Gustas Tu", 6, 13, 7, 13, 4, 2001));
        trackList.add(new Track(1, "Vanessa", 6, 14, 4, 14, 3, 1996));
        return trackList;
    }


}

