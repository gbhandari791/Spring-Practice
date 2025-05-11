package spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Inside Home Controller");
		model.addAttribute("message", "This is home page from model");
		
		List<String> list = new ArrayList<>();
		list.add("MI");
		list.add("CSK");
		list.add("RCB");
		model.addAttribute("teamList", list);
		
		return "home";
	}
	
	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView view = new ModelAndView();
		view.addObject("about", "This is about page");
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		view.addObject("fruits", fruits);		
		
		view.setViewName("about");
		return view;
	}
	
}
