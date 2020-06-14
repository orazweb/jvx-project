package com.wildcodeschool.disco_project.repository;

import com.wildcodeschool.disco_project.entity.Album;
import com.wildcodeschool.disco_project.entity.Artist;
import com.wildcodeschool.disco_project.repository.ArtistRepository;
import com.wildcodeschool.disco_project.util.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlbumRepository implements DiscoDao<Album>{
    
    private final static String DB_URL = "jdbc:mysql://captain.javarover.wilders.dev:33307/mydb?serverTimezone=GMT";
    private final static String DB_USER = "root";
    private final static String DB_PASSWORD = "ax3kuN4guthe";

    @Override
    public List<Album> findAll() {

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            statement = connection.prepareStatement(
                    "SELECT album.id, album.title, artist.id, artist.artist_name, album.year, label.name " +
                            "FROM album JOIN artist ON artist.id = album.artist_id " +
                            "JOIN label ON label.id = album.label_id " +
                            "ORDER BY album.title;"
            );
            resultSet = statement.executeQuery();

            List<Album> albums = new ArrayList<>();

            while (resultSet.next()) {

                Long id = resultSet.getLong("album.id");
                String title = resultSet.getString("album.title");
                Long year = resultSet.getLong("album.year");
                String label = resultSet.getString("label.name");
                String artistName = resultSet.getString("artist.artist_name");
                Long idArtist = resultSet.getLong("artist.id");
                albums.add(new Album(id, title, year, label, artistName, idArtist));
            }
            return albums;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResultSet(resultSet);
            JdbcUtils.closeStatement(statement);
            JdbcUtils.closeConnection(connection);
        }
        return null;
    }

    @Override
    public List<Album> findAlbumsByArtistId(Long id) {

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            statement = connection.prepareStatement(
                    "SELECT album.*, label.name, artist.artist_name " +
                            "FROM album " +
                            "JOIN label ON album.label_id = label.id " +
                            "JOIN artist ON artist.id = album.artist_id " +
                            "WHERE artist.id = ?;"
            );
            resultSet = statement.executeQuery();

            List<Album> albums = new ArrayList<>();

            while (resultSet.next()) {

                String title = resultSet.getString("album.title");
                Long year = resultSet.getLong("album.year");
                String label = resultSet.getString("label.name");
                String artistName  = resultSet.getString("artist.artist_name");
                Long idArtist= resultSet.getLong("album.artist_id");

                albums.add(new Album(id, title, year, label, artistName, idArtist));
            }
            return albums;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResultSet(resultSet);
            JdbcUtils.closeStatement(statement);
            JdbcUtils.closeConnection(connection);
        }
        return null;
    }

    @Override
    public List<Album> findTracksByAlbumId(Long id) {
        return null;
    }

    @Override
    public Album findById(Long id) {
//
//        // TODO Read one
//        Connection connection = null;
//        PreparedStatement statement = null;
//        ResultSet resultSet = null;
//        try {
//            connection = DriverManager.getConnection(
//                    DB_URL, DB_USER, DB_PASSWORD
//            );
//            statement = connection.prepareStatement(
//                    /*"SELECT * FROM album WHERE id = ?;"*/
//                    "SELECT " +
//                            "album.title, " +
//                            "album.year, " +
//                            "label.name, " +
//                            "artist.artist_name, " +
//                            "album.id AS id_album " +
//                            "FROM album " +
//                            "JOIN artist ON artist.id = album.artist_id " +
//                            "JOIN label ON label.id = album.label_id " +
//                            "WHERE album.id = ?;"
//            );
//            statement.setLong(1, id);
//            resultSet = statement.executeQuery();
//
//            if (resultSet.next()) {
//
//                String title = resultSet.getString("title");
//                int year = resultSet.getInt("year");
//                String label = resultSet.getString("label.name");
//                String artistName = resultSet.getString("artist.artist_name");
//                return new Album(id, title, year, label, artistName) ;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            JdbcUtils.closeResultSet(resultSet);
//            JdbcUtils.closeStatement(statement);
//            JdbcUtils.closeConnection(connection);
//        }
        return null;
    }

}
