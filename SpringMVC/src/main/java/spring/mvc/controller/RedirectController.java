package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/redirect")
public class RedirectController {

	// Using redirect prefix
//	@GetMapping("/handleForm")
//	public String handleForm() {
//		System.out.println("Inside Handle Form");
//		String msg = "This is from handleForm";
//		int id = 2;
//		return "redirect:/redirect/success?msg=" + msg + "&id=" + id;
//	}
//	
//	@GetMapping("/success")
//	public String success(@RequestParam("msg") String msg, @RequestParam("id") int id) {
//		System.out.println("Inside Success");
//		System.out.println(id);
//		System.out.println(msg);
//		return "redirectSuccess";
//	}
	
	// using RedirectView 
	@GetMapping("/handleForm")
	public RedirectView handleForm() {
		System.out.println("Inside Handle Form");
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("success");
		
		return redirectView;
	}
	
	@GetMapping("/success")
	public String success() {
		
		System.out.println("Inside Success");
		return "redirectSuccess";
	}
}
