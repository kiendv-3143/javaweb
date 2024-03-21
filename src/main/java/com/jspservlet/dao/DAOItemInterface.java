package com.jspservlet.dao;

import com.jspservlet.model.ItemModel;

import java.util.List;

public interface DAOItemInterface extends DAOGenericInterface<ItemModel> {
    List<ItemModel> getAll();
}
