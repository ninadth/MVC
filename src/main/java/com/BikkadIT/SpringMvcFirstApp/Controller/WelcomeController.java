package com.BikkadIT.SpringMvcFirstApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	public WelcomeController() {
		super();
	System.out.println("welcome class controller");
	}

	@GetMapping("/welcomeMsg")
	public ModelAndView welcomeMsg() {
		
	String msg="Welcome to BikkadIT";
	
	ModelAndView mav=new ModelAndView();
	mav.addObject("MASSAGE", msg);
	mav.setViewName("welcome");
	
		return mav;
		
		
	}
}
