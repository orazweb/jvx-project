package com.wildcodeschool.disco_project.track;
import java.util.ArrayList;
import java.util.List;

public class TrackDisplay {

    public static void main(String[] args) {

        TrackFolder trackFolder = new TrackFolder();

        String folder = "tracksLib";

        List<String> tracks = new ArrayList<>();

        tracks = trackFolder.getResourceFiles(folder);

        for ( String track : tracks) {

            System.out.println(track);
        }

        //System.out.println(tracks);

        trackFolder.getMetadata()

    }

}
