package spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mvc.form.LoginForm;
import spring.mvc.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/showLogin")
	public String showLogin() {
		return "login";
	}
	
	
	@ModelAttribute
	public void commonModelData(Model model) {
		model.addAttribute("loginHeader", "This is success page");
		model.addAttribute("description", "You have successfully loged In");
	}
	
	@PostMapping("/processLogin")
	public String processLogin(@ModelAttribute LoginForm loginForm, Model model) {
		
		int userId = this.userService.createUser(loginForm);
		model.addAttribute("userId", userId);
		
		return "loginSuccess";
	}
	
//	@PostMapping("/processLogin")
//	public String processLogin(
//			@RequestParam("userName") String userName, 
//			@RequestParam("passWord") String passWord, 
//			@RequestParam(name = "age", required = false, defaultValue = "18") Integer userAge, 
//			Model model) {
//
//		System.out.println(userName);
//		System.out.println(passWord);
//		System.out.println(userAge);
//		
//		model.addAttribute("userName", userName);
//		model.addAttribute("passWord", passWord);
//		if(userAge != null) {
//			model.addAttribute("age", userAge);
//		}
//		
//		return "loginSuccess";
//	}
}
