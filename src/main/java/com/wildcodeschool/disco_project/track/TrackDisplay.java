package com.wildcodeschool.disco_project.track;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;



public class TrackDisplay {



    public static void main(String[] args) {

        TrackSetting trackSetting = new TrackSetting();

        TrackFolder trackFolder = new TrackFolder();

        List<String> metadatas = new ArrayList<>();

        // liste de track
        List<Track> tracks = new ArrayList<>();

        // recupère la liste des fichiers MP3 dans le dossier "tracksLib"
        File[] files = TrackFolder.getResourceFolderFiles("tracksLib");



        for (File file : files) {
            //Track(String number, String title, String artist, String album, String year, String genre, String duration, String path)
            tracks.add(
                    new Track(
                            trackSetting.formatTrackNumber(trackFolder.getMetadata(file).get("xmpDM:trackNumber")),
                            trackSetting.getMetadata(file).get("dc:title"),
                            trackSetting.getMetadata(file).get("xmpDM:artist"),
                            trackSetting.getMetadata(file).get("xmpDM:album"),
                            trackSetting.getMetadata(file).get("xmpDM:releaseDate"),
                            trackSetting.getMetadata(file).get("xmpDM:genre"),
                            trackSetting.toMinutes(trackFolder.getMetadata(file).get("xmpDM:duration")),
                            file.toString()
                    )
            );
        }

        for (Track track: tracks) {
            System.out.println(track.getPath());
        }




























 /*
    }
    public static void run() {
 */
        //AudioParser audio = new AudioParser();
        //TrackFolder trackFolder = new TrackFolder();
        //List<String> metadatas = new ArrayList<>();

         //Metadata metadata = new Metadata();
         // List all metadata
         //String[] metadataNames = metadata.names();

//         for(String name : metadataNames){
//         //System.out.println(name + ": " + metadata.get(name));
//         }

//        List<String> metadatas = new ArrayList<>();


//        // 1. avoir une liste de fichier
//        System.out.println("*** running track scanner");
////        File[] files = TrackFolder.getResourceFolderFiles("tracksLib");
////        for (File file : files) {
////            System.out.println(file);
////        }
//
//        System.out.println("**********************************************");
//        for (File file : files) {
//
//
//
//            /* track number formatage */
//            System.out.println("track number : " + trackFolder.getMetadata(file).get("xmpDM:trackNumber"));
////            StringTokenizer multiTokenizer = new StringTokenizer(
////                    trackFolder.getMetadata(file).get("xmpDM:trackNumber"),
////                    "/");
////            String trackNumber = multiTokenizer.nextToken();
////
////            if (trackNumber.charAt(0) != '0'){
////                System.out.println("track number (without 0) : " + trackNumber);
////            }
////            else{
////                System.out.println("track number (with 0) : " + trackNumber.substring(1));
////            }
//
//
//            /* fin de track number formatage */
//            System.out.println("Track title : " + trackFolder.getMetadata(file).get("dc:title"));
//            System.out.println("album title : " + trackFolder.getMetadata(file).get("xmpDM:album"));
//            System.out.println("album artist : " + trackFolder.getMetadata(file).get("xmpDM:artist"));
//            System.out.println("album year : " + trackFolder.getMetadata(file).get("xmpDM:releaseDate"));
//            System.out.println("genre : " + trackFolder.getMetadata(file).get("xmpDM:genre"));
//            System.out.println("duration : " + trackFolder.getMetadata(file).get("xmpDM:duration"));
//            System.out.println("duration : " + toMinutes(trackFolder.getMetadata(file).get("xmpDM:duration")));
//
//            System.out.println("-----------------------------------------------------------------");
//
//            metadatas.add(trackFolder.getMetadata(file).get("xmpDM:album"));
//            metadatas.add(trackFolder.getMetadata(file).get("xmpDM:artist"));
//
//
//
//        } /* fin du parcours des  fichiers MP3*/
//
//        System.out.println("normalement, ci dessous, " +
//                "on doit afficher le titre de l'album du premier track sur la liste");
//        System.out.println(metadatas.get(0));
//        System.out.println("normalement, ci dessous, " +
//                "on doit afficher le titre de l'album du troisième track sur la liste soit <<<Encore>>>");
//        System.out.println(metadatas.get(4));
/* il reste plus qu'a stocker chaque infos du fichier mp3 dans un objet de type Track
* Quelles infos récupère t-on depuis le fichier MP3 ?
*  - track number
*  - track title
*  - track artist
*  - track album
*  - track year
*  - track genre
*  - track duration
* chaque objet de type Track ainsi alimenté par ces infos se verra donc stocké dans une
* liste d'objet de type Track :
* List<Track> tracks = new Array ArrayList<>();
*
* */

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



//System.out.println(multiTokenizer.nextToken());
//System.out.println("toto" + multiTokenizer.nextToken());
//            if(multiTokenizer.nextToken().charAt(0)!= 0){
//                System.out.println("track number without 0");
//                System.out.println("multiTokenizer.nextToken().charAt(0)!= 0 " + multiTokenizer.nextToken().charAt(0));
//                //System.out.println("track number without 0 : " + multiTokenizer.nextToken());
//            }
//            else{
//                System.out.println("track number with 0");
//                System.out.println("multiTokenizer.nextToken().charAt(0)!= 0 " + multiTokenizer.nextToken().charAt(0));
//                System.out.println("track number without 0 : " + multiTokenizer.nextToken().substring(1));
//            }



//System.out.println(multiTokenizer.nextToken().charAt(0));
//System.out.println("track number : " + multiTokenizer.nextToken());
///////////////////////////////////////////////////////////////////////////////////////////////////////