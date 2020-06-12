package com.wildcodeschool.disco_project.repository;

import com.wildcodeschool.disco_project.entity.Artist;
import com.wildcodeschool.disco_project.util.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArtistRepository implements DiscoDao<Artist> {
    // captain.javarover.wilders.dev -P 33307
    //mysql -u root -h captain.javarover.wilders.dev -P 33307 -p , pwd: ax3kuN4guthe

    private final static String DB_URL = "jdbc:mysql://captain.javarover.wilders.dev:33307/mydb?serverTimezone=GMT";
    //private final static String DB_URL = "jdbc:mysql://captain.javarover.wilders.dev:33307/mydb";
    private final static String DB_USER = "root";
    private final static String DB_PASSWORD = "ax3kuN4guthe";


    @Override
    public Artist findById(Long id) {

        // TODO Read one
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            statement = connection.prepareStatement(
                    "SELECT * " +
                            "FROM artist " +
                            "WHERE id = ?;"
            );
            statement.setLong(1, id);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {

                String name = resultSet.getString("artist_name");

                return new Artist(id, name);
            }
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
    public List<Artist> findAll() {

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            statement = connection.prepareStatement(
                    "SELECT * FROM artist;"
            );
            resultSet = statement.executeQuery();

            List<Artist> artists = new ArrayList<>();

            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String artistName = resultSet.getString("artist_name");

                artists.add(new Artist(id, artistName));
            }
            return artists;
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
