package com.xgcd.demo.jpa.service.impl;

import com.xgcd.demo.jpa.dao.XgcdUserDao;
import com.xgcd.demo.jpa.entity.XgcdUser;
import com.xgcd.demo.jpa.service.XgcdUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XgcdUserServiceImpl implements XgcdUserService {
    @Autowired
    private XgcdUserDao xgcdUserDao;

    @Override
    public List<XgcdUser> findAll() {
        return xgcdUserDao.findAll();
    }
}
