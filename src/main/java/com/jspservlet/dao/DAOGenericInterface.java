package com.jspservlet.dao;

import com.jspservlet.mapper.RowMapper;

import java.util.List;

public interface DAOGenericInterface<T> {
    <T> List<T> query(String sql, RowMapper<T> rowMapper);
}
