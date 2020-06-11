package com.project.java.player.Controllers;


import com.project.java.player.Models.Track;
import com.project.java.player.dao.TrackDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TrackController {

    @Autowired
    @Qualifier("trackRepo")
    private TrackDao TrackRepo;

    @ResponseBody
    @GetMapping("/trackRepo")
    public List<Track> getTrack() {
        return TrackRepo.findAll();
    }



}
