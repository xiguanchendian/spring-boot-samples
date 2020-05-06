package com.xgcd.demo.jpa.service;

import com.xgcd.demo.jpa.entity.XgcdUser;

import java.util.List;

public interface XgcdUserService {
    List<XgcdUser> findAll();
}
