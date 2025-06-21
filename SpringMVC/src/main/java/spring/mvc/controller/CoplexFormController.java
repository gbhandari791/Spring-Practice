package spring.mvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.bytebuddy.matcher.ModifierMatcher.Mode;
import spring.mvc.form.ComplexForm;

@Controller
@RequestMapping("/complexForm")
public class CoplexFormController {

	@GetMapping("/showComlexForm")
	public String showComplexForm() {
		return "showComplex";
	}
	
	@PostMapping("/processComlexForm")
	public String processComlexForm(@ModelAttribute("complexForm") ComplexForm complexForm, BindingResult result) {

		if(result.hasErrors()) {
			return "showComplex";
		}
		
//		String text = null;
//		text.length();
		
//		int i = 1/0;
		
		int[] arr = {1, 2, 3};
        System.out.println(arr[5]); 
		
		return "processComlexForm";
	}
	
	@ExceptionHandler(value = NullPointerException.class)
	public String nullExceptionHandler(Model model) {
		model.addAttribute("msg", "Null Pointer Exception occured");
		return "excetionHandler";
	}
	
	@ExceptionHandler({ArithmeticException.class, NumberFormatException.class})
	public String ArithMaticExeptionHandler(Model model) {
		model.addAttribute("msg", "ArithMatic Exception occured");
		return "excetionHandler";
	}
	
	@ExceptionHandler(value = Exception.class)
	public String allExeptionHandler(Model model) {
		model.addAttribute("msg", "Exception occured");
		return "excetionHandler";
	}

}
