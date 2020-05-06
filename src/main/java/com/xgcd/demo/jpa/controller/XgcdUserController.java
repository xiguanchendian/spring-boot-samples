package com.xgcd.demo.jpa.controller;

import com.xgcd.demo.jpa.entity.XgcdUser;
import com.xgcd.demo.jpa.service.XgcdUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("xgcdUserController")
public class XgcdUserController {
    @Autowired
    private XgcdUserService xgcdUserService;

    @GetMapping("/list")
    public List<XgcdUser> findAll() {
        return xgcdUserService.findAll();
    }
}
