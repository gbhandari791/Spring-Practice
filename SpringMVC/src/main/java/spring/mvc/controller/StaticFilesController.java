package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staticr")
public class StaticFilesController {

	@GetMapping("/getstaticr")
	public String staticResources() {
		return "staticRecources";
	}
	
}
