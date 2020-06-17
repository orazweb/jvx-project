package com.wildcodeschool.disco_project.entity;

import java.util.List;

public class Artist {

    private Long id;
    private String name;
    private String labelName;
    private String albumTitle;
    private String albumYear;

    private List<Album> albums ;

    //  constructor
    public Artist(Long id, String artistName) { }

    public Artist(Long id, String name,
                  String labelName, String albumTitle,
                  String albumYear ) {
        this.id = id;
        this.name = name;
        this.labelName = labelName;
        this.albumTitle = albumTitle;
        this.albumYear = albumYear;

    }

//  getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getLabelName() { return labelName; }
    public String getAlbumTitle() { return albumTitle; }
    public String getAlbumYear() { return albumYear; }


//  setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setLabelName(String labelName) { this.labelName = labelName;}
    public void setAlbumTitle(String albumTitle) { this.albumTitle = albumTitle; }
    public void setAlbumYear(String albumYear) { this.albumYear = albumYear; }
}
