package com.BikkadIT.SpringMvcFirstApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Greet {

	public Greet() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Greet controller");
	}

	@GetMapping("/Greetmsg")
	public String greetMsg(Model model) {
		
		String msg="good morning all";
		
		model.addAttribute("Greetmsg", msg);
		
		return "greet";
		
	}
}
