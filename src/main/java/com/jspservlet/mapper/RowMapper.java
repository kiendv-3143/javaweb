package com.jspservlet.mapper;

import java.sql.ResultSet;

public interface RowMapper<T> {
    T rowMapper(ResultSet resultSet);
}
