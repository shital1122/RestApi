package com.durgasoft.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ComponentScan
public class LoginController {

	@RequestMapping(value = "/loginpage", method = RequestMethod.GET)
	public String showLoginPage() {
		System.out.println("hiiii");
		return "loginform";
	}

	@RequestMapping(value = "/process", method = RequestMethod.POST)
	public String login(@RequestParam String uname, @RequestParam String upwd, ModelMap map) {
		map.addAttribute("username", uname);
		map.addAttribute("password", upwd);

		String status = "";
		if (uname.equals("shital") && upwd.equals("shital")) {
			status = "success";

		} else {

			status = "failure";
		}
		return status;
	}

}
