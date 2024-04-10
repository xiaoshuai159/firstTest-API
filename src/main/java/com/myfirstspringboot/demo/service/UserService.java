package com.myfirstspringboot.demo.service;

import com.myfirstspringboot.demo.pojo.User;

public interface UserService {
    User findByUsername(String username);
    void register(String username, String password);

    void update(User user);

    void updateAvatar(String avatarUrl);

    void updatePwd(String newPwd);
}
