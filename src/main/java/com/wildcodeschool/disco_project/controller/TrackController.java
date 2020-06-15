package com.wildcodeschool.disco_project.controller;

// import com.wildcodeschool.disco_project.repository.TrackDao;
// import com.wildcodeschool.disco_project.repository.TrackRepository; jer-dev

import com.wildcodeschool.disco_project.DAO.TrackDao; //dev_html3

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class TrackController {
 //jer-dev
 //   @Autowired
 //   private TrackDao repository ;
 //
 //   @GetMapping("/artist/tracks/album")
 //   public String getTracks(Model model,
 //                          @RequestParam(required = false) Long id) {
 //
 //      if (id != null)
 //          model.addAttribute("tracks", repository.findAllTracksByIdAlbum(id));


    @Autowired
    private TrackDao dao = new TrackDao();

    @GetMapping("/tracks")
//    @ResponseBody
    public String getTracks(Model model, @RequestParam(required = false) Long id) {

        if (id != null)
            model.addAttribute("tracks", dao.findAllById(id));
        return "tracks";
    }
}



