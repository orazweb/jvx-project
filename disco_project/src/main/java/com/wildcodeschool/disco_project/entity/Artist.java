package com.wildcodeschool.disco_project.entity;

public class Artist {

    private int id;
    private String name;

    //  constructor
    public Artist() { }

    //  constructor
    public Artist(int id, String name) {
        this.id = id;
        this.name = name;
    }
//  getters
    public int getId() { return id; }
    public String getName() { return name; }

//  setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
}
