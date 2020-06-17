package com.wildcodeschool.disco_project.repository;

import com.wildcodeschool.disco_project.DAO.ArtistDao;
import com.wildcodeschool.disco_project.config.AppConfig;
import com.wildcodeschool.disco_project.entity.Artist;
import com.wildcodeschool.disco_project.util.JdbcUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ArtistRepository implements ArtistDao<Artist> {


    //mysql -u root -h captain.javarover.wilders.dev -P 33307 -p , pwd: ax3kuN4guthe

//    private final static String DB_URL = "jdbc:mysql://captain.javarover.wilders.dev:33307/mydb?serverTimezone=GMT";
//    private final static String DB_USER = "root";
//    private final static String DB_PASSWORD = "ax3kuN4guthe";

    private final Logger L = LoggerFactory.getLogger(getClass());

    @Autowired
    private AppConfig config;

    public Artist findArtistById(Long id) {


        L.info("mysql url> " + config.mysql.url);

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            connection = JdbcUtils.getConnection(null, config.mysql);
            statement = connection.prepareStatement(
                    "SELECT artist.artist_name FROM artist where  artist.id = ? ;"
            );
            statement.setLong(1, id);
            rs = statement.executeQuery();

            if (rs.next()) {
                String artistName = rs.getString("artist.artist_name");
                return new Artist(id, artistName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closeStatement(statement);
            JdbcUtils.closeConnection(connection);
        }
        return null;
    }

    public List<Artist> findAllArtists() {

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            connection = JdbcUtils.getConnection(config.mysql, config.mysql);
            statement = connection.prepareStatement(
                    "SELECT * FROM artist;"
            );
            rs = statement.executeQuery();

            List<Artist> artists = new ArrayList<>();

            while (rs.next()) {
                Long id = rs.getLong("id");
                String artistName = rs.getString("artist_name");
                artists.add(new Artist(id, artistName));
            }
            return artists;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closeStatement(statement);
            JdbcUtils.closeConnection(connection);
        }
        return null;
    }

}

