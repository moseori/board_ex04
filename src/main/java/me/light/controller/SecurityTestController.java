package me.light.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/security")
public class SecurityTestController {

	@GetMapping("/all")
	public void doAll() {
		System.out.println("모든 방문자");
	}

	@GetMapping("/member")
	public void doMember() {
		System.out.println("회원");
	}
	
	@GetMapping("/admin")
	public void doAdmin() {
		System.out.println("관리자");
	}
}
