package com.jspservlet.service;

import com.jspservlet.model.UserModel;

public interface UserInterfaceService {
    UserModel findUserByUserName(String userName);
}
