package com.xworkz.stabilizer.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class LoginController {

	public LoginController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/login.odc")
	public String onLogin(@RequestParam String uname, @RequestParam String password,Model model) {
		System.out.println("invoked on login");
		System.out.println("user name" + uname);
		System.out.println("password" + password);
		if ("xworkz".equals(uname) && "secret".equals(password)) {
			System.out.println("username and password matching, navigate to loginsuccess");
			model.addAttribute("username",uname);//k=string, value=obj
			model.addAttribute("message","welcome to online classes from xworkz"+uname);
			return "LoginSuccess";
		}

		System.out.println("username and password does not matching, navigate to login page");

		return "Login";
	}

}
