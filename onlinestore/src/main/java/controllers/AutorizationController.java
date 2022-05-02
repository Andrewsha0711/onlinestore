package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import models.User;

@Controller
public class AutorizationController {
	@GetMapping("/autorization")
	public String autorization(Model model) {
		model.addAttribute("user", new User());
		return "login_form";
	}
	@PostMapping("/autorization")
	public String checkUser(@RequestParam("username") String username,
			                @RequestParam("password") String password,
			                Model model){
		//Find by username
		//Check password
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		model.addAttribute("user", new User());
		
		return "redirect:/";
		//return "home_page";
	}
}