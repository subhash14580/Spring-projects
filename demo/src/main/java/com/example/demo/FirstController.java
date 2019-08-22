package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class FirstController {
	//	@RequestMapping("/")
		public String getJsp() {
			return "temp.jsp";
		}
}
