package com.jspservlet.dao.implement;

import com.jspservlet.dao.DAOItemInterface;
import com.jspservlet.mapper.implement.ItemMapper;
import com.jspservlet.model.ItemModel;

import java.util.List;

public class DAOItem extends DAOAbstract<ItemModel> implements DAOItemInterface {

    @Override
    public List<ItemModel> getAll() {
        String sql = "select * from items";
        return query(sql, new ItemMapper());
    }
}
