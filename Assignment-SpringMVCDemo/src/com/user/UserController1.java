package com.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


public class UserController1 extends AbstractController{
	
	 @RequestMapping("/usercontroller1")
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView m = new ModelAndView();
		m.setViewName("showMessageView");
		m.addObject("msg","hello world");
		return m;
	}
	 
}
