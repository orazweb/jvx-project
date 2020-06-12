package com.wildcodeschool.disco_project.entity;

public class Artist {

    private Long id;
    private String name;

    //  constructor
    public Artist() { }

    //  constructor
    public Artist(Long id, String name) {
        this.id = id;
        this.name = name;
    }
//  getters
    public Long getId() { return id; }
    public String getName() { return name; }

//  setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
}
