package spring.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String nullExceptionHandler(Model model) {
		model.addAttribute("msg", "Null Pointer Exception occured");
		return "excetionHandler";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ArithmeticException.class, NumberFormatException.class})
	public String ArithMaticExeptionHandler(Model model) {
		model.addAttribute("msg", "ArithMatic Exception occured");
		return "excetionHandler";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String allExeptionHandler(Model model) {
		model.addAttribute("msg", "Exception occured");
		return "excetionHandler";
	}
}	



