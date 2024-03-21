package com.jspservlet.dao;

import com.jspservlet.model.UserModel;

import java.util.List;

public interface DAOUserInterface extends DAOGenericInterface<UserModel> {
    UserModel findByUserName(String userName);
}
