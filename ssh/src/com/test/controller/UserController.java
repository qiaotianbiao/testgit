package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.User;
import com.test.dao.UserDao;
import com.test.entity.SysUser;
import com.test.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;
	
	@Autowired
	UserDao dao;
	
	@RequestMapping("/toLogin")
	public String tologin()
	{
		return "front/login";
	}
	
	@RequestMapping("/login")
	public String login(Model m,SysUser u)
	{
		dao.save(u);
		m.addAttribute("u", u);
		return "front/success";
	}
}
