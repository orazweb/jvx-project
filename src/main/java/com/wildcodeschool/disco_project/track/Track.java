package com.wildcodeschool.disco_project.track;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.mp3.Mp3Parser;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.*;
import java.net.URL;
import java.util.StringTokenizer;

public class Track {
    /*
     *  - track number
     *  - track title
     *  - track artist
     *  - track album
     *  - track year
     *  - track genre
     *  - track duration
     */
    // attributes
    private String number, title, artist, album, year, genre, duration, path;

    // constructor
    public Track(){

    }

    public Track(String number, String title, String artist, String album, String year, String genre, String duration, String path) {
        this.number = number;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.genre = genre;
        this.duration = duration;
        this.path = path;
    }

    // getters
    public String getNumber() { return number; }
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getAlbum() { return album; }
    public String getYear() { return year; }
    public String getGenre() { return genre; }
    public String getDuration() { return duration; }
    public String getPath() { return path; }

    // setters
    public void setNumber(String number) { this.number = number; }
    public void setTitle(String title) { this.title = title; }
    public void setArtist(String artist) { this.artist = artist; }
    public void setAlbum(String album) { this.album = album; }
    public void setYear(String year) { this.year = year; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setDuration(String duration) { this.duration = duration; }
    public void setPath(String path) { this.path = path; }

    //methods`



}