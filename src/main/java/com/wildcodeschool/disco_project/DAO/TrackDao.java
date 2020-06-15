package com.wildcodeschool.disco_project.DAO;

import com.wildcodeschool.disco_project.config.AppConfig;
import com.wildcodeschool.disco_project.entity.Track;
import com.wildcodeschool.disco_project.util.JdbcUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TrackDao {

//    private static final String MYSQL_URL = "jdbc:mysql://127.0.0.1:3306/kata_sql_restaurant?serverTimezone=GMT";
//    private static final String MYSQL_USERNAME = "root";
//    private static final String MYSQL_PASSWORD = "i-am-root";


    private final Logger L = LoggerFactory.getLogger(getClass());

    @Autowired
    private AppConfig config;

    public List<Track> list() {

        System.out.println(config.mysql.url);

        L.info("mysql url> " + config.mysql.url);

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {

            // connection
            connection = JdbcUtils.getConnection(config.mysql);

            // exec query
            String sql = "select * from restaurant";
            statement = connection.prepareStatement(sql);
            rs = statement.executeQuery();

            // read results
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
            L.error("failed to get tracks", e);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "failed to get tracks", e);
        } finally {
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closeStatement(statement);
            JdbcUtils.closeConnection(connection);
        }
    }
}
