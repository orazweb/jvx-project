package com.wildcodeschool.disco_project.scanner;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.mp3.Mp3Parser;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class AudioParser {

    public static Metadata getMetadata(File fileLocation) {

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

    private List<String> getResourceFiles(String path) throws IOException {
        List<String> filenames = new ArrayList<>();

        try (InputStream in = getResourceAsStream(path);
             BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            String resource;

            while ((resource = br.readLine()) != null) {
                filenames.add(resource);
            }
        }

        return filenames;
    }

    private InputStream getResourceAsStream(String resource) {
        final InputStream in = getContextClassLoader().getResourceAsStream(resource);

        return in == null ? getClass().getResourceAsStream(resource) : in;
    }

    private ClassLoader getContextClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }

    public static void main(String[] args) {
        String fileLocation = "/Volumes/DATA/Wild-Code-School/Formation/Projects/jvx-project/src/main/resources/tracksLib/01 - Safe And Sound.mp3";
        //Metadata metadata = getMetadata(fileLocation);
        //System.out.println(metadata.get("xmpDM:album"));
        //System.out.println(metadata.get("xmpDM:artist"));

        List<String> tracks = new ArrayList<>();
        // tracks = getResourceFiles("tracksLib");

        // try {
        //
        // InputStream input = new FileInputStream(new File(fileLocation));
        // ContentHandler handler = new DefaultHandler();
        // Metadata metadata = new Metadata();
        // Parser parser = new Mp3Parser();
        // ParseContext parseCtx = new ParseContext();
        // parser.parse(input, handler, metadata, parseCtx);
        // input.close();
        //
        // // List all metadata
        // String[] metadataNames = metadata.names();
        //
        // for(String name : metadataNames){
        // System.out.println(name + ": " + metadata.get(name));
        // }
        //
        // // Retrieve the necessary info from metadata
        // // Names - title, xmpDM:artist etc. - mentioned below may differ based
        // System.out.println("----------------------------------------------");
        // System.out.println("Title: " + metadata.get("title"));
        // System.out.println("Artists: " + metadata.get("xmpDM:artist"));
        // System.out.println("Composer : "+metadata.get("xmpDM:composer"));
        // System.out.println("Genre : "+metadata.get("xmpDM:genre"));
        // System.out.println("Album : "+metadata.get("xmpDM:album"));
        // System.out.println("Album : "+metadata.get("xmpDM:album"));
        //
        // } catch (FileNotFoundException e) {
        // e.printStackTrace();
        // } catch (IOException e) {
        // e.printStackTrace();
        // } catch (SAXException e) {
        // e.printStackTrace();
        // } catch (TikaException e) {
        // e.printStackTrace();
        // }

    }

}