package com.jspservlet.dao.implement;

import com.jspservlet.dao.DAOGenericInterface;
import com.jspservlet.mapper.RowMapper;
import io.github.cdimascio.dotenv.Dotenv;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOAbstract<T> implements DAOGenericInterface<T> {

    public Connection getConnection() {
        try {
            Dotenv dotenv = Dotenv.load();
            Class.forName(dotenv.get("DB_DRIVER"));
            String url = dotenv.get("DB_URL");
            String username = dotenv.get("DB_USERNAME");
            String password = dotenv.get("DB_PASSWORD");
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> List<T> query(String sql, RowMapper<T> rowMapper) {
        List<T> results = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                results.add(rowMapper.rowMapper(resultSet));
            }
            return results;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
