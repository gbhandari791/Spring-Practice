package spring.mvc.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Service
public class FileUploadService {

	public void processFileUpload(HttpSession session, CommonsMultipartFile file) {
		String path = session.getServletContext().getRealPath("/") + "uploadedFiles" + File.separator;

		// Ensure the directory exists
		File dir = new File(path);
		if (!dir.exists())
			dir.mkdirs();

		// Final path for the uploaded file
		String fullPath = path + file.getOriginalFilename();

		try {
			byte[] data = file.getBytes();
			FileOutputStream outputStream = new FileOutputStream(fullPath);
			outputStream.write(data);
			outputStream.close();
			System.out.println("File uploaded to: " + fullPath);
		} catch (IOException e) {
			System.out.println("File upload failed: " + e);
		}
	}

}
