package com.xgcd.demo.jpa.dao;

import com.xgcd.demo.jpa.entity.XgcdUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface XgcdUserDao extends JpaRepository<XgcdUser, Integer> {
}
