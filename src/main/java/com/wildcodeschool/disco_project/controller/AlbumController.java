package com.wildcodeschool.disco_project.controller;
import com.wildcodeschool.disco_project.DAO.AlbumDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AlbumController {

    @Autowired
    private AlbumDao repository ;

    @GetMapping("/albums")
    public String getAll(Model model) {
        model.addAttribute("albums", repository.findAllAlbums());
        return "albums";
    }

    @GetMapping("/albums/artist")
    public String getAlbums(Model model,
                           @RequestParam(required = false) Long id) {

        if (id != null)
            model.addAttribute("albums", repository.findAllAlbumsByIdArtist(id));
        return "artist";
    }
}
