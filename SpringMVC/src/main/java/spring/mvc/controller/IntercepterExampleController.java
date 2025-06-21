package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IntercepterExampleController {

	@GetMapping("/showInterceptorExample")
	public String showIntercetorExample() {
		return "showInterceptorExample";
	}
	
	@PostMapping("/processIntercepterExamle")
	public String processIntercepterExamle(@RequestParam("someText") String someText, Model model) {
		model.addAttribute("someText", someText);
		return "processIntercepterExamle";
	}

	
}
