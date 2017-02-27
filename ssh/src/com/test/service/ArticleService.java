package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.ArticleDao;
import com.test.dao.UserDao;
import com.test.entity.Article;
import com.test.entity.SysUser;

@Service
public class ArticleService {
  @Autowired 
  ArticleDao dao;
  
  @Transactional
  public void save(Article e)
  {
	  dao.save(e);
	  System.out.println("============");
  }
}
