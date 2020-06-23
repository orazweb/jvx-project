package com.wildcodeschool.disco_project.repository;

import com.wildcodeschool.disco_project.DAO.GenericDao;
import com.wildcodeschool.disco_project.DAO.TrackDao;
import com.wildcodeschool.disco_project.config.AppConfig;
import com.wildcodeschool.disco_project.entity.Track;
import com.wildcodeschool.disco_project.util.JdbcUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@Repository
public class TrackRepository implements TrackDao {

    private final Logger L = LoggerFactory.getLogger(getClass());

    @Autowired
    private AppConfig config;


    @Override
    public List<Track> findAllTracksByIdAlbum(Long albumId) {
        L.info("mysql url> " + config.mysql.url);

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            connection = JdbcUtils.getConnection(config.mysql);

            statement = connection.prepareStatement(
                    "SELECT track.id, " +
                            "track.track_number, " +
                            "track.track_name, " +
                            "track.track_time, " +
                            "track.year, " +
                            "label.name, " +
                            "style.name, " +
                            "artist.artist_name, " +
                            "album.title, " +
                            "album.id " +
                            "FROM album JOIN label ON album.label_id = label.id " +
                            "JOIN artist ON artist.id = album.artist_id " +
                            "JOIN track ON artist.id = track.artist_id " +
                            "JOIN style ON style.id = track.style_id " +
                            "WHERE album.id = ? " +
                            "ORDER BY track.track_number;"

            );
            statement.setLong(1, albumId);
            rs = statement.executeQuery();

            List<Track> tracks = new ArrayList<>();

            while (rs.next()) {
                Long id = rs.getLong("track.id");
                int number = rs.getInt("track.track_number");
                String name = rs.getString("track.track_name");
                String artistName = rs.getString("artist.artist_name");
                String genre = rs.getString("style.name");
                String duration  = rs.getString("track.track_time");
                int year  = rs.getInt("track.year");
                String albumName  = rs.getString("album.title");

                tracks.add(new Track(id, number, name, artistName, genre, duration, year, albumName));
            }
            return tracks;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closeStatement(statement);
            JdbcUtils.closeConnection(connection);
        }
        return null;
    }

    @Override
    public List<Track> findAll() {
        return null;
    }

    @Override
    public Track findById(Long id) {
        return null;
    }

    @Override
    public Track create(Track model) {
        return null;
    }

    @Override
    public Track update(Track model) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }


//    public List<Track> findAllTracksByIdAlbum(Long album_id) {
//
//        L.info("mysql url> " + config.mysql.url);
//
//        Connection connection = null;
//        PreparedStatement statement = null;
//        ResultSet rs = null;
//
//        try {
//            connection = JdbcUtils.getConnection(config.mysql);
//
//            statement = connection.prepareStatement(
//                    "SELECT track.id, " +
//                                "track.track_number, " +
//                                "track.track_name, " +
//                                "track.track_time, " +
//                                "track.year, " +
//                                "label.name, " +
//                                "style.name, " +
//                                "artist.artist_name, " +
//                                "album.title, " +
//                                "album.id " +
//                           "FROM album JOIN label ON album.label_id = label.id " +
//                           "JOIN artist ON artist.id = album.artist_id " +
//                           "JOIN track ON artist.id = track.artist_id " +
//                           "JOIN style ON style.id = track.style_id " +
//                           "WHERE album.id = ? " +
//                           "ORDER BY track.track_number;"
//
//            );
//            statement.setLong(1, album_id);
//            rs = statement.executeQuery();
//
//            List<Track> tracks = new ArrayList<>();
//
//            while (rs.next()) {
//                Long id = rs.getLong("track.id");
//                int number = rs.getInt("track.track_number");
//                String name = rs.getString("track.track_name");
//                String artistName = rs.getString("artist.artist_name");
//                String genre = rs.getString("style.name");
//                String duration  = rs.getString("track.track_time");
//                int year  = rs.getInt("track.year");
//                String albumName  = rs.getString("album.title");
//
//                tracks.add(new Track(id, number, name, artistName, genre, duration, year, albumName));
//            }
//            return tracks;
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            JdbcUtils.closeResultSet(rs);
//            JdbcUtils.closeStatement(statement);
//            JdbcUtils.closeConnection(connection);
//        }
//        return null;
//    }


}
