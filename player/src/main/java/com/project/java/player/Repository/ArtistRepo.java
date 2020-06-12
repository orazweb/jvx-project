package com.project.java.player.Repository;

import com.project.java.player.Models.Artist;
import com.project.java.player.dao.ArtistDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArtistRepo implements ArtistDao {
    @Override
    public static List<Artist> findAll() {
        List<Artist> artistList = new ArrayList<>();
        artistList.add(new Artist(3, "Manu Chao");

        return artistList;
    }
}