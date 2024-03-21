package com.jspservlet.mapper.implement;

import com.jspservlet.mapper.RowMapper;
import com.jspservlet.model.ItemModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemMapper implements RowMapper<ItemModel> {
    @Override
    public ItemModel rowMapper(ResultSet resultSet) {
        try {
            ItemModel item = new ItemModel();
            item.setId(resultSet.getLong("id"));
            item.setName(resultSet.getString("name"));
            item.setPrice(resultSet.getFloat("price"));
            item.setDescription(resultSet.getString("description"));
            item.setImage(resultSet.getString("image"));
            return item;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
