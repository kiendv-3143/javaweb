package com.jspservlet.dao.implement;

import com.jspservlet.dao.DAOUserInterface;
import com.jspservlet.mapper.implement.UserMapper;
import com.jspservlet.model.UserModel;

import java.util.List;

public class DAOUser extends DAOAbstract<UserModel> implements DAOUserInterface {

    @Override
    public UserModel findByUserName(String userName) {
        String sql = "select * from users";
        List<UserModel> user = query(sql, new UserMapper());
        return !user.isEmpty() ? user.get(0) : null;
    }
}
