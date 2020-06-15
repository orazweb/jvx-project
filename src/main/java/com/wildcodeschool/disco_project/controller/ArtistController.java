package com.wildcodeschool.disco_project.controller;
import com.wildcodeschool.disco_project.repository.ArtistDao;
import com.wildcodeschool.disco_project.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ArtistController {
    @Autowired
    private ArtistDao repository;

    @GetMapping("/artists")
    public String getAll(Model model) {

        model.addAttribute("artists", repository.findAllArtists());

        return "artists";
    }


}







