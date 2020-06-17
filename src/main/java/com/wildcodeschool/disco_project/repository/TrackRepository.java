package com.wildcodeschool.disco_project.repository;

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
public class TrackRepository implements TrackDao<Track> {

//    private final static String DB_URL = "jdbc:mysql://captain.javarover.wilders.dev:33307/mydb?serverTimezone=GMT";
//    private final static String DB_USER = "root";
//    private final static String DB_PASSWORD = "ax3kuN4guthe";

    private final Logger L = LoggerFactory.getLogger(getClass());

    @Autowired
    private AppConfig config;

    public List<Track> findAllTracksByIdAlbum(Long album_id) {

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
            statement.setLong(1, album_id);
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
}