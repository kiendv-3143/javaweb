package com.jspservlet.service;

import com.jspservlet.model.UserModel;

public interface UserServiceInterface {
    UserModel findUserByUserName(String userName);
}
