package com.wildcodeschool.disco_project.controller;

 import com.wildcodeschool.disco_project.repository.TrackRepository;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/track/create")
    public String postTrack(Model model,
                            @RequestParam Long id,
                            @RequestParam int number,
                            @RequestParam String name,
                            @RequestParam String artistName,
                            @RequestParam String duration,
                            @RequestParam int year,
                            @RequestParam String albumName
                            @RequestParam(required = false, defaultValue = " ") String genre,
                            @RequestParam(required = false, defaultValue = "false") Long duration
    ) {
        if(id != null)
        model.addAttribute("track", TrackRepository.save(id, number,
                name, artistName, duration, year, albumName, genre));

        return "track_get";
    }
}



