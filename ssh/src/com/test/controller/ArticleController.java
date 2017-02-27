package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.User;
import com.test.dao.UserDao;
import com.test.entity.Article;
import com.test.entity.SysUser;
import com.test.service.ArticleService;
import com.test.service.UserService;

@Controller
@RequestMapping("/cms")
public class ArticleController {
	@Autowired
	ArticleService service;
	
	@RequestMapping("/toPublish")
	public String toPublish()
	{
		return "front/publish";
	}
	
	@RequestMapping("/publish")
	public String publish(Model m,Article e)
	{
		service.save(e);
		m.addAttribute("e",e);
		return "front/viewArticle";
	}
}
