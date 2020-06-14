package com.wildcodeschool.disco_project.entity;

public class Album {

    private Long id;
    private String title;
    private Long year;
    private String label;
    private String artistName;
    private Long idArtist;


    //  constructor
    public Album() { }

    //  constructor
    public Album(Long id, String title, Long year , String label, String artistName, Long idArtist) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.label = label;
        this.artistName = artistName;
        this.idArtist = idArtist;
    }

    // getters
    public Long getId() { return id;}
    public String getTitle() { return title; }
    public Long getYear() { return year; }
    public String getLabel() { return label; }
    public String getArtistName() { return artistName; }
    public Long getIdArtist() { return idArtist; }
    // setters
    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setYear(Long year) { this.year = year; }
    public void setLabel(String label) { this.label = label; }
    public void setArtistName(String artistName) { this.artistName = artistName; }
    public void setIdArtist() { this.idArtist = idArtist ; }

}
