package com.server.sso;

import com.model.LoginUser;
import com.model.User;
import com.server.sso.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * LoginController
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;
    @PostMapping("/doLogin")
    public ResponseEntity doLogin(@RequestBody LoginUser user) {
        User u = userService.SelectUserByName(user.getUsername());
        if(user.getPassword().equals(u.getPassword()))  {
            return ResponseEntity.ok("登录成功");
        } else {
            return ResponseEntity.ok("登录失败");
        }
    }
}