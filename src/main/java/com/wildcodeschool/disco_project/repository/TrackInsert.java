package com.wildcodeschool.disco_project.repository;

import com.wildcodeschool.disco_project.DAO.TrackDao;
import com.wildcodeschool.disco_project.config.AppConfig;
import com.wildcodeschool.disco_project.entity.Track;
import com.wildcodeschool.disco_project.util.JdbcUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;

@Repository
public class TrackInsert implements TrackDao<Track> {

    private final Logger L = LoggerFactory.getLogger(getClass());

    @Autowired
    private AppConfig config;
    private Long id;
    private int number;
    private String name;
    private String artistName;
    private String genre;
    private String duration;
    private int year;
    private String albumName;


    @Override
    public List<Track> findAllTracksByIdAlbum(Long album_id) {
        return null;
    }

    @Override
    public Track save(Long id, int number, String name, String artistName, String genre,
                      String duration, int year, String albumName) {


        L.info("mysql url> " + config.mysql.url);

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            connection = JdbcUtils.getConnection(config.mysql);

            statement = connection.prepareStatement(
                    "INSERT INTO track (track_number, track_name, track_time," +
                            " artist_id, style_id, year, album_id, album_label_id) " +
                            "VALUES (?,?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS
            );
            statement.setInt(1, number);
            statement.setString(2, name);
            statement.setString(3, artistName);
            statement.setString(4, genre);
            statement.setString(5, duration);
            statement.setInt(6, year);
            statement.setString(7, albumName);

            if (statement.executeUpdate() != 1) {
                throw new SQLException("failed to insert data");
            }

            ResultSet generatedKeys = statement.getGeneratedKeys();

            if (generatedKeys.next()) {
                return new Track(id, name, artistName, genre, duration, year, albumName);
            } else {
                throw new SQLException("failed to get inserted id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Track save(Track entity) {
        return null;
    }

}

