package com.jspservlet.service.implement;

import com.jspservlet.dao.DAOUserInterface;
import com.jspservlet.dao.implement.DAOUser;
import com.jspservlet.model.UserModel;
import com.jspservlet.service.UserInterfaceService;

public class UserService implements UserInterfaceService {
    @Override
    public UserModel findUserByUserName(String userName) {
        DAOUserInterface daoUser = new DAOUser();
        return daoUser.findByUserName(userName);
    }
}
