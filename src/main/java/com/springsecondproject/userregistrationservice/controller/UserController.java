package com.springsecondproject.userregistrationservice.controller;

import com.springsecondproject.userregistrationservice.dto.UserDTO;
import com.springsecondproject.userregistrationservice.service.UserRegServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*
Controller - Service
Service - Repository
 */

@RestController
@RequestMapping("registration")
public class UserController {

    @Autowired
    private UserRegServiceImpl userRegServiceImpl;
    @PostMapping
    public void registerVal(@RequestBody UserDTO userDTO)
    {
        this.userRegServiceImpl.registerValue(userDTO);
    }


}
