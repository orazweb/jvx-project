package com.wildcodeschool.disco_project.track;
import com.wildcodeschool.disco_project.scanner.AudioParser;
import com.wildcodeschool.disco_project.track.TrackDisplay;
import java.util.ArrayList;
import java.util.List;

import com.drew.metadata.Metadata;

import java.io.File;

public class TrackDisplay {

    public static void main(String[] args) {
 /*
    }
    public static void run() {
 */
        //AudioParser audio = new AudioParser();
        TrackFolder trackFolder = new TrackFolder();
        List<String> metadatas = new ArrayList<>();

         //Metadata metadata = new Metadata();
         // List all metadata
         //String[] metadataNames = metadata.names();

//         for(String name : metadataNames){
//         //System.out.println(name + ": " + metadata.get(name));
//         }
        // 1. avoir une liste de fichier
        System.out.println("*** running track scanner");
        File[] files = TrackFolder.getResourceFolderFiles("tracksLib");
        for (File file : files) {
            System.out.println(file);
        }
        System.out.println("**********************************************");
        for (File file : files) {
            //System.out.println(file);
            //System.out.println(trackFolder.getMetadata(file));
            //metadatas.add(trackFolder.getMetadata(file).get("xmpDM:album"));

            System.out.println("album title : " + trackFolder.getMetadata(file).get("xmpDM:album"));
            System.out.println("track number : " + trackFolder.getMetadata(file).get("xmpDM:trackNumber"));
            System.out.println("album artist : " + trackFolder.getMetadata(file).get("meta:author"));
            System.out.println("album year : " + trackFolder.getMetadata(file).get("xmpDM:releaseDate"));
            System.out.println("Track title : " + trackFolder.getMetadata(file).get("dc:title"));
            System.out.println("-----------------------------------------------------------------");

        }


        // 2. avoir une liste de metadata

       /*List<Metadata> metadatas = new ArrayList<>();
       for (File file : files) {
           Metadata metadata = AudioParser.getMetadata(file);
           metadatas.add(metadata);
           metadatas.add(audio.getMetadata(file));
           Metadata metadata = new Metadata(metadatas.add(audio.getMetadata(file)));
           System.out.println(file);
       }*/

        // 3. avoir une liste de Track

       
    }

}
