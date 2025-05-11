package spring.mvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import spring.mvc.service.FileUploadService;

@Controller
@RequestMapping("/fileUpload")
public class FileUploadController {
	
	@Autowired
	FileUploadService fileUploadService = null;

	@GetMapping("/showFileUpload")
	public String showFileUpload() {
		
		return "showFileUpload";
	}
	
	@PostMapping("/processFileUpload")
	public String processFileUpload(@RequestParam("fileUploaded") CommonsMultipartFile file, HttpSession session) {
		
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		System.out.println(file.getBytes());
		
		fileUploadService.processFileUpload(session, file);
		
		return "successFileUpload";
	}
}
