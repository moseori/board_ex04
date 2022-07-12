package me.light.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

	@GetMapping("/accessError")
	public String accessDenied() {
		return "error/accessDenied";
	}

	@RequestMapping("/customLogin")
	public String loginForm(String error, Model model) {
		if (error!=null) {
			System.out.println("error");
			model.addAttribute("error",error);
		}
		return "member/login";
	}
	
	@GetMapping("/customLogout")
	public String logout() {
		return "member/logout";
	}
}
