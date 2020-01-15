package com.server.sso.controller;

import com.server.sso.service.UserService;

import java.util.List;

import com.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/query")
    public User QueryUser(){
        return userService.SelectUserByName("Daisy");
    }

    @GetMapping("/insert")
    public List<User> testInsert() {
        userService.insertService();
        return userService.selectAllUser();
    }

    @RequestMapping("/changemoney")
    public List<User> testchangemoney() {
        userService.changemoney();
        return userService.selectAllUser();
    }

    @GetMapping("/delete")
    public String testDelete() {
        userService.deleteService(3);
        return "OK";
    }
}