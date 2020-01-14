package com.server.sso;

import com.model.LoginUser;

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
    @PostMapping("/doLogin")
    public ResponseEntity doLogin(@RequestBody LoginUser user) {
        if("admin".equals(user.getUsername()) && "password".equals(user.getPassword()))  {
            return ResponseEntity.ok("登录成功");
        } else {
            return ResponseEntity.ok("登录失败");
        }
    }
}