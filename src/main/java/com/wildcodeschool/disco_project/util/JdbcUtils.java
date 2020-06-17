package com.wildcodeschool.disco_project.util;

import com.wildcodeschool.disco_project.config.SqlConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

/**
     * Utility methods for closing JDBC resources.
     *
     * https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/jdbc/support/JdbcUtils.html
     * https://www.selikoff.net/2008/07/30/finally-closing-jdbc-resources/
     */
    public class JdbcUtils {

    private final static Logger L = LoggerFactory.getLogger(JdbcUtils.class);



    public static Connection getConnection(SqlConfig config) throws SQLException {
        return DriverManager.getConnection(config.url, config.username, config.password);

    }

        public static void closeConnection (Connection con){
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    L.error("failed to close connection", e);
                }
            }
        }

        public static void closeResultSet (ResultSet rs){
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    L.error("failed to close result set", e);
                }
            }
        }

        public static void closeStatement (Statement stmt){
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    L.error("failed to close statement", e);
                }
            }
        }


    }



