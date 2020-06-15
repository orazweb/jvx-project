package com.wildcodeschool.disco_project.repository;

import com.wildcodeschool.disco_project.entity.Album;
import com.wildcodeschool.disco_project.entity.Track;
import com.wildcodeschool.disco_project.util.JdbcUtils;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TrackRepository implements TrackDao<Track> {

    private final static String DB_URL = "jdbc:mysql://captain.javarover.wilders.dev:33307/mydb?serverTimezone=GMT";
    private final static String DB_USER = "root";
    private final static String DB_PASSWORD = "ax3kuN4guthe";



    @Override
    public List<Track> findAllTracksByIdAlbum(Long album_id) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
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
            statement.setLong(1, album_id);
            resultSet = statement.executeQuery();

            List<Track> tracks = new ArrayList<>();

            while (resultSet.next()) {
                Long id = resultSet.getLong("track.id");
                int number = resultSet.getInt("track.track_number");
                String name = resultSet.getString("track.track_name");
                String artistName = resultSet.getString("artist.artist_name");
                String genre = resultSet.getString("style.name");
                String duration  = resultSet.getString("track.track_time");
                int year  = resultSet.getInt("track.year");
                String albumName  = resultSet.getString("album.title");

                tracks.add(new Track(id, number, name, artistName, genre, duration, year, albumName));
            }
            return tracks;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResultSet(resultSet);
            JdbcUtils.closeStatement(statement);
            JdbcUtils.closeConnection(connection);
        }
        return null;
    }
}
