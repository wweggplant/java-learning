package com.server.sso.service;

import com.model.LoginUser;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public class GodService {
    @Autowired
    private UserService userService;

    public void Login(LoginUser user) {
        User u = userService.SelectUserByName(user.getUsername());
        boolean canLogin = false;
        if (user.getPassword().equals(u.getPassword())) {
            canLogin = true;
        }
        if (canLogin) {
            // 使用状态模式 流转行为
        }
    }
    public void checkAccountStatus(){
        // 使用状态模式 流转行为
    }
}