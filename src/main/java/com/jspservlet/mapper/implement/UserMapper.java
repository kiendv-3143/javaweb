package com.jspservlet.mapper.implement;

import com.jspservlet.mapper.RowMapper;
import com.jspservlet.model.UserModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<UserModel> {
    @Override
    public UserModel rowMapper(ResultSet resultSet) {
        try {
            UserModel user = new UserModel();
            user.setId(resultSet.getLong("id"));
            user.setUserName(resultSet.getString("user_name"));
            user.setPassword(resultSet.getString("password"));
            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
