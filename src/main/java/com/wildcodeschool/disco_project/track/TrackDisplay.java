package com.wildcodeschool.disco_project.track;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TrackDisplay {

    public static void main(String[] args) {

        TrackSetting trackSetting = new TrackSetting();
        // liste de track
        List<Track> tracks = new ArrayList<>();

        // recupère la liste des fichiers MP3 dans le dossier "tracksLib"
        File[] files = TrackSetting.getResourceFolderFiles("tracksLib");

        // crée la liste des tracks
        for (File file : files) {
            //Track(String number, String title, String artist, String album, String year, String genre, String duration, String path)
            tracks.add(
                    new Track(
                            trackSetting.formatTrackNumber(trackSetting.getMetadata(file).get("xmpDM:trackNumber")),
                            trackSetting.getMetadata(file).get("dc:title"),
                            trackSetting.getMetadata(file).get("xmpDM:artist"),
                            trackSetting.getMetadata(file).get("xmpDM:album"),
                            trackSetting.getMetadata(file).get("xmpDM:releaseDate"),
                            trackSetting.getMetadata(file).get("xmpDM:genre"),
                            trackSetting.toMinutes(trackSetting.getMetadata(file).get("xmpDM:duration")),
                            file.toString()
                    )
            );
        }

        for (Track track: tracks) {
            System.out.println(track.getPath());
        }
    }
}

