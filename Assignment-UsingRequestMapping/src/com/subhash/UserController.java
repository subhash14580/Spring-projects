package com.subhash;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/hi")
public class UserController {
	 public UserController() {
		// TODO Auto-generated constructor stub
		System.out.println("askdkgjh");
	}
	 @RequestMapping(value = "/hello",method=RequestMethod.GET)
	public String handleRequestInternal(@RequestParam("name") String name,Model model) throws Exception{
		 System.out.println("inside the handleRequest");
		String na = "Hi "+name+"!" ;
		System.out.println("na na na na"+na);
		model.addAttribute("msg", na);
		
		return "success";
	}
} 

