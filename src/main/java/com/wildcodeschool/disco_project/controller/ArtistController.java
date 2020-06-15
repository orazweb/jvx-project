package com.wildcodeschool.disco_project.controller;
import com.wildcodeschool.disco_project.repository.ArtistRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ArtistController {

    private ArtistRepository repository = new ArtistRepository();

    @GetMapping("/artists")
    public String getAll(Model model) {

        model.addAttribute("artists", repository.findAll());

        return "artists";
    }


}







