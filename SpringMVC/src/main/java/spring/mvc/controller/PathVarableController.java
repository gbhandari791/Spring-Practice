package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pathv")
public class PathVarableController {

	@GetMapping("/user/{userId}/userName/{userName}")
	public String handelPathVariable(@PathVariable("userId") Integer userId, @PathVariable("userName") String userName, Model model) {
		
		model.addAttribute("userId", userId);
		model.addAttribute("userName", userName);
		return "pathV";
	}
	
	



}
