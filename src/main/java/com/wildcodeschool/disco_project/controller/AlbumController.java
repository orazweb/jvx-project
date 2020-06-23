package com.wildcodeschool.disco_project.controller;

import com.wildcodeschool.disco_project.DAO.AlbumDao;
import com.wildcodeschool.disco_project.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AlbumController {

    @Autowired
    private AlbumRepository repository;
    //private AlbumDao repository;

    @GetMapping("/albums")
    public String getAllAlbums(Model model) {
        model.addAttribute("albums", repository.findAll());
        return "albums";
    }

    @GetMapping("/albums/artist") /* l'idArtist ne peut pas avoir la valeur null */
    public String getAlbumsByIdArtist(Model model, Long idArtist) {
        model.addAttribute("albums", repository.findAllById(idArtist));
        return "artist";
    }

//    @GetMapping("/albums")
//    public String getAllAlbums(Model model) {
//        model.addAttribute("albums", repository.findAllAlbums());
//        return "albums";
//    }
//
//    @GetMapping("/albums/artist") /* l'idArtist ne peut pas avoir la valeur null */
//    public String getAlbumsByIdArtist(Model model, Long idArtist) {
//        model.addAttribute("albums", repository.findAllAlbumsByIdArtist(idArtist));
//        return "artist";
//    }


//    @GetMapping("/albums/artist")
//    public String getAlbums(Model model,
//                           @RequestParam(required = false) Long idArtist) {
//        if (idArtist != null)
//            model.addAttribute("albums", repository.findAllAlbumsByIdArtist(idArtist));
//        return "artist";
//    }
}
