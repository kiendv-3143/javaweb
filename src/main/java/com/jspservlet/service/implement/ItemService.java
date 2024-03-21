package com.jspservlet.service.implement;

import com.jspservlet.dao.DAOItemInterface;
import com.jspservlet.dao.implement.DAOItem;
import com.jspservlet.model.ItemModel;
import com.jspservlet.service.ItemServiceInterface;

import java.util.List;

public class ItemService implements ItemServiceInterface {

    @Override
    public List<ItemModel> getAll() {
        DAOItemInterface daoItem = new DAOItem();
        return daoItem.getAll();
    }
}
