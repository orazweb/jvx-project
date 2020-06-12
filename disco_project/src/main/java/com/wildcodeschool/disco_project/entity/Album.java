package com.wildcodeschool.disco_project.entity;

public class Album {

    private Long id;
    private String title;
    private int year;
    private String label;
    String artistName;

    //  constructor
    public Album() { }

    //  constructor
    public Album(Long id, String title, int year, String label, String artistName) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.label = label;
        this.artistName = artistName;
    }

    // getters
    public Long getId() { return id;}
    public String getTitle() { return title; }
    public int getYear() { return year; }
    public String getLabel() { return label; }
    public String getArtistName() { return artistName; }
    // setters
    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setYear(int year) { this.year = year; }
    public void setLabel(String label) { this.label = label; }
    public void setArtistName(String artistName) { this.artistName = artistName; }

}
