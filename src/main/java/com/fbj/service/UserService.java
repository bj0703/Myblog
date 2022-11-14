package com.fbj.service;

import com.fbj.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
