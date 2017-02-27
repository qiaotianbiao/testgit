package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.UserDao;
import com.test.entity.SysUser;

@Service
public class UserService {
  @Autowired 
  UserDao dao;
  
  @Transactional
  public void save(SysUser u)
  {
	  dao.save(u);
	  System.out.println("============");
  }
}
