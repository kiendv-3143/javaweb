package com.jspservlet.service.implement;

import com.jspservlet.dao.DAOUserInterface;
import com.jspservlet.dao.implement.DAOUser;
import com.jspservlet.model.UserModel;
import com.jspservlet.service.UserServiceInterface;

public class UserService implements UserServiceInterface {
    @Override
    public UserModel findUserByUserName(String userName) {
        DAOUserInterface daoUser = new DAOUser();
        return daoUser.findByUserName(userName);
    }
}
