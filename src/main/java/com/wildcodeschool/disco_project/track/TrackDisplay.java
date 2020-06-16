package com.wildcodeschool.disco_project.track;

import java.util.ArrayList;
import java.util.List;

import com.drew.metadata.Metadata;
import com.wildcodeschool.disco_project.scanner.AudioParser;

import java.io.File;

public class TrackDisplay {

    public static void run() {

        // 1. avoir une liste de fichier
        System.out.println("*** running track scanner");
        File[] files = TrackFolder.getResourceFolderFiles("tracksLib");
        for (File file : files) {
            System.out.println(file);
        }

        // 2. avoir une liste de metadata
        List<Metadata> metadatas = new ArrayList<>();
        for (File file : files) { 
            Metadata metadata = AudioParser.getMetadata(file); 
            metadatas.add(metadata);
        }

        // 3. avoir une liste de Track

       
    }

}
