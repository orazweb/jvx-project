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

public class TrackSetting {

    public TrackSetting() {
    }

    /*
     convert metadata duration millisecond into duration hh:mm:ss
     */
    public  String toMinutes(String timeInMilis) {
        double milis = Double.valueOf(timeInMilis);
        long second = (long) (milis / 1000) % 60;
        long minute = (long) (milis / (1000 * 60)) % 60;
        long hour = (long) (milis / (1000 * 60 * 60)) % 24;
        return hour != 0 ? String.format("%02dh:%02dm:%02ds", hour, minute, second) : String.format("%02dm:%02ds", minute, second);
    }

    /*
     format track number
     e,i : trackNumber = 07/20 -> SubTrackNumber = 07 -> return 7
     */
    public String formatTrackNumber(String trackNumber){

        StringTokenizer multiTokenizer = new StringTokenizer(trackNumber , "/");
        String SubTrackNumber = multiTokenizer.nextToken();

        return SubTrackNumber.charAt(0) != '0' ? SubTrackNumber : SubTrackNumber.substring(1);
    }

    public Metadata getMetadata(File fileLocation) {
        try {

            InputStream input = new FileInputStream(fileLocation);
            ContentHandler handler = new DefaultHandler();
            Metadata metadata = new Metadata();
            Parser parser = new Mp3Parser();
            ParseContext parseCtx = new ParseContext();
            parser.parse(input, handler, metadata, parseCtx);
            input.close();

            return metadata;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (TikaException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static File[] getResourceFolderFiles(String folder) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource(folder);
        String path = url.getPath();
        return new File(path).listFiles();
    }
}