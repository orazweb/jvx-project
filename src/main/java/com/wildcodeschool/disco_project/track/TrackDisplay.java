package com.wildcodeschool.disco_project.track;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TrackDisplay {

    public static void main(String[] args) {
 /*
    }
    public static void run() {
 */
        //AudioParser audio = new AudioParser();
        TrackFolder trackFolder = new TrackFolder();
        //List<String> metadatas = new ArrayList<>();

         //Metadata metadata = new Metadata();
         // List all metadata
         //String[] metadataNames = metadata.names();

//         for(String name : metadataNames){
//         //System.out.println(name + ": " + metadata.get(name));
//         }

        List<String> metadatas = new ArrayList<>();


        // 1. avoir une liste de fichier
        System.out.println("*** running track scanner");
        File[] files = TrackFolder.getResourceFolderFiles("tracksLib");
//        for (File file : files) {
//            System.out.println(file);
//        }

        System.out.println("**********************************************");
        for (File file : files) {

            System.out.println("album title : " + trackFolder.getMetadata(file).get("xmpDM:album"));
            //System.out.println("track number : " + trackFolder.getMetadata(file).get("xmpDM:trackNumber"));
            /* formatage du numéro de la piste */
            StringTokenizer multiTokenizer = new StringTokenizer(
                    trackFolder.getMetadata(file).get("xmpDM:trackNumber"),
                    "/");
            System.out.println("track number : " + multiTokenizer.nextToken());
            System.out.println("album artist : " + trackFolder.getMetadata(file).get("xmpDM:artist"));
            System.out.println("album year : " + trackFolder.getMetadata(file).get("xmpDM:releaseDate"));
            System.out.println("Track title : " + trackFolder.getMetadata(file).get("dc:title"));
            System.out.println("genre : " + trackFolder.getMetadata(file).get("xmpDM:genre"));
            System.out.println("-----------------------------------------------------------------");




            metadatas.add(trackFolder.getMetadata(file).get("xmpDM:album"));
            metadatas.add(trackFolder.getMetadata(file).get("xmpDM:artist"));
        }

    }
}



        // 1. avoir une liste de fichier
//        System.out.println("*** running track scanner");
//        File[] files = TrackFolder.getResourceFolderFiles("tracksLib");
//        for (File file : files) {
//            System.out.println(file);
//        }
//        System.out.println("**********************************************");
//        for (File file : files) {
//
//            System.out.println("album title : " + trackFolder.getMetadata(file).get("xmpDM:album"));
//            System.out.println("track number : " + trackFolder.getMetadata(file).get("xmpDM:trackNumber"));
//            System.out.println("album artist : " + trackFolder.getMetadata(file).get("xmpDM:artist"));
//            System.out.println("album year : " + trackFolder.getMetadata(file).get("xmpDM:releaseDate"));
//            System.out.println("Track title : " + trackFolder.getMetadata(file).get("dc:title"));
//            System.out.println("genre : " + trackFolder.getMetadata(file).get("xmpDM:genre"));
//            System.out.println("-----------------------------------------------------------------");
//            //System.out.println(file);
//            //System.out.println(trackFolder.getMetadata(file));
//
//            metadatas.add(trackFolder.getMetadata(file).get("xmpDM:album"));
//            metadatas.add(trackFolder.getMetadata(file).get("xmpDM:artist"));
//        }
//        System.out.println("-----------------------------------------------------------------");
//        System.out.println("affichage de la metadata <album> de chaque track");
//        System.out.println("-----------------------------------------------------------------");
////        for (String metadata: metadatas) {
////
////            System.out.println("album : "+metadatas.get(0)+ "artist : "+metadatas.get(1));
////            System.out.println("---------------------------------------------------");
////
////        }
//
//        System.out.println("album : "+metadatas.get(4)+ " artist : "+metadatas.get(5));
//        System.out.println("---------------------------------------------------");


        // 2. avoir une liste de metadata
//        List<Metadata> metadatas = new ArrayList<>();
//        for (File file : files) {
////            Metadata metadata = AudioParser.getMetadata(file);
////            metadatas.add(metadata);
//            //metadatas.add(audio.getMetadata(file));
//            //Metadata metadata = new Metadata(metadatas.add(audio.getMetadata(file)));
//            System.out.println(file);
//        }

        // 3. avoir une liste de Track

       
//    }
//
//}


//       // String trackNumber = "5/10";
//        // extraire le numero des pistes;
////        StringTokenizer multiTokenizer = new StringTokenizer(trackNumber, "://.-");
//        StringTokenizer multiTokenizer = new StringTokenizer(trackNumber, "/");
////        while (multiTokenizer.hasMoreTokens())
////        {
////            System.out.println(multiTokenizer.nextToken());
////        }
//        System.out.println(multiTokenizer.nextToken());

//String trackNumber = "5";
//StringTokenizer multiTokenizer = new StringTokenizer(trackNumber, "/");
//System.out.println(multiTokenizer.nextToken());