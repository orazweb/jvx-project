package com.wildcodeschool.disco_project.controller;

import com.wildcodeschool.disco_project.entity.Album;
import com.wildcodeschool.disco_project.repository.AlbumRepository;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AlbumController {

    private AlbumRepository repository = new AlbumRepository();

    @GetMapping("/albums")
    public String getAll(Model model) {

        model.addAttribute("albums", repository.findAll());

        return "albums";
    }

    @GetMapping("/album")
    public String getAlbum(Model model,
                            @RequestParam(required = false) Long id) {

        Album album = new Album();
        if (id != null) {
            album = repository.findById(id);
        }
        model.addAttribute("album", album);

        return "album";
    }
}
