package com.wildcodeschool.disco_project.controller;

import com.wildcodeschool.disco_project.entity.Album;
import com.wildcodeschool.disco_project.repository.AlbumRepository;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {

    private AlbumRepository repository = new AlbumRepository();

//    @GetMapping("/artist")
//    public String getAlbums(Model model,
//                           @RequestParam(required = false) Long id) {
//
//        if (id != null)
//            model.addAttribute("albums", repository.findAlbumsByArtistId(id));
//        return "artist";
//    }


//    test -----------
//    @GetMapping("/artist")
//    public String getAllAlbums(Model model) {
//        model.addAttribute("albums", repository.findAll());
//        return "artist";
//    }
// fin de test --------

    //--------------------------------------------------------------------------------
//    @GetMapping("/artist")
//    public String getAlbums(Model model,
//                           @RequestParam(required = false) Long id) {
//
//        //Album album = new Album();
//
//        List<Album> albums = new ArrayList<>();
//
//        if (id != null)
//            albums = repository.findAlbumsByArtistId(id);
//
//        model.addAttribute("albums", albums);
//
//        return "artist";
//    }
   //--------------------------------------------------------------------------------



    @GetMapping("/albums")
    public String getAll(Model model) {
        model.addAttribute("albums", repository.findAll());
        return "albums";
    }

//    @GetMapping("/artist")
//    public String getAlbumsByIdArtist(Model model, @RequestParam(required = false) Long id) {
//        model.addAttribute("albums", repository.findAlbumsByArtistId(id));
//        return "artist";
//    }

//    @GetMapping("/album")
//    public String getAlbum(Model model,
//                            @RequestParam(required = false) Long id) {
//
//        Album album = new Album();
//        if (id != null) {
//            album = repository.findById(id);
//        }
//        model.addAttribute("album", album);
//
//        return "album";
//    }


//    @GetMapping("/album")
//    public List<Album> getAlbums(Model model,
//                                 @RequestParam(required = false) Long id) {
//
//        Album album = new Album();
//        if (id != null) {
//            List<album> = repository.findAlbumsByArtistId(id);
//        }
//        model.addAttribute("album", album);
//
//        return "album";
//    }
}
