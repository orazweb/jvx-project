package com.wildcodeschool.disco_project.controller;

 import com.wildcodeschool.disco_project.repository.TrackRepository;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
    private TrackRepository repository = new TrackRepository();

    @GetMapping("/tracks")
//    @ResponseBody
    public String getTracks(Model model, @RequestParam(required = false) Long id) {

        if (id != null)
            model.addAttribute("tracks", repository.findAllTracksByIdAlbum(id));
        return "tracks";
    }
}



