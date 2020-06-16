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

public class TrackFolder {

    public TrackFolder() {
    }

    public static File[] getResourceFolderFiles(String folder) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource(folder);
        String path = url.getPath();
        return new File(path).listFiles();
    }

    // Partie 01 : Methodes permettant le listing des pistes MP3 contenues dans un
    // dossier (album) --------------------
    // public List<String> getResourceFiles(String path) {
    // List<String> filenames = new ArrayList<>();

    // try (InputStream in = getResourceAsStream(path);
    // BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

    // String resource;
    // while ((resource = br.readLine()) != null) {
    // filenames.add(resource);
    // }
    // } catch (IOException e) {
    // e.printStackTrace();
    // }

    // return filenames;
    // }

    // public InputStream getResourceAsStream(path) {
    // final InputStream in = getContextClassLoader().getResourceAsStream(path);

    // return in == null ? getClass().getResourceAsStream(path) : in;
    // }

    // public ClassLoader getContextClassLoader() {
    // return Thread.currentThread().getContextClassLoader();
    // }

    // fin de Partie 01
    // ------------------------------------------------------------------------------------------------

    // Partie 02 : methode(s) pour l'extraction des métadonnées d'un fichier MP3
    // ---------------------------------------

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

    // private List<String> getResourceFiles(String path) throws IOException {
    // List<String> filenames = new ArrayList<>();
    //
    // try (
    // InputStream in = getResourceAsStream(path);
    // BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
    // String resource;
    //
    // while ((resource = br.readLine()) != null) {
    // filenames.add(resource);
    // }
    // }
    //
    // return filenames;
    // }

    // private InputStream getResourceAsStream(String resource) {
    // final InputStream in
    // = getContextClassLoader().getResourceAsStream(resource);
    //
    // return in == null ? getClass().getResourceAsStream(resource) : in;
    // }

    // private ClassLoader getContextClassLoader() {
    // return Thread.currentThread().getContextClassLoader();
    // }
}
