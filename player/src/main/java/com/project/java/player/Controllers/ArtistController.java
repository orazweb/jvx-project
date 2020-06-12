package com.project.java.player.Controllers;


import com.project.java.player.Models.Artist;
import com.project.java.player.Repository.ArtistRepo;
import com.project.java.player.dao.ArtistDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ArtistController {

    @Autowired
    @Qualifier("artistRepo")
    private ArtistDao ArtistDao;

    @ResponseBody
    @GetMapping("/artistRepo")
    public List<Artist> getArtist_name(){
        return ArtistRepo.findAll();
    }
}
