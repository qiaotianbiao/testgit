package com.test.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.entity.Article;
import com.test.entity.SysUser;

@Repository
public class ArticleDao {
   @Autowired
   SessionFactory sf;
   
   public void save(Article e)
   {
	   sf.getCurrentSession().save(e);
   }
}
