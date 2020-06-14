package com.wildcodeschool.disco_project.controller;

import com.wildcodeschool.disco_project.entity.Artist;
import com.wildcodeschool.disco_project.repository.ArtistRepository;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class ArtistController {

    private ArtistRepository repository = new ArtistRepository();

    @GetMapping("/artists")
    public String getAll(Model model) {

        model.addAttribute("artists", repository.findAll());

        return "artists";
    }

    @GetMapping("/artist")
    public String getArtist(Model model,
                            @RequestParam(required = false) Long id) {

        Artist artist = new Artist();
        if (id != null) {
            artist = repository.findById(id);
        }
        model.addAttribute("artist", artist);

        return "artist";
    }

//    @GetMapping("/artist")
//    public String getArtist(Model model,
//                            @RequestParam(required = false) Long id) {
//
//        Artist artist = new Artist();
//        if (id != null) {
//            artist = repository.findById(id);
//        }
//        model.addAttribute("artist", artist);
//
//        return "artist";
//    }

}







