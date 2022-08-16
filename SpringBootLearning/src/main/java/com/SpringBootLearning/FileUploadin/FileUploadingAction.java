package com.SpringBootLearning.FileUploadin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/FileUploadingAction")

public class FileUploadingAction {
	
	@Autowired
	private FileUploadingServices fileUploadingServices;
	
	@RequestMapping("/UploadFile")
	public String openFileUploadPage()
	{
		System.out.println("open file upload page...");
		return "uploadFile";
	}
	
	@PostMapping("file-upload")
	public ResponseEntity<String> fileUplodingAction(@RequestParam("fileId") MultipartFile file)
	{
		try
		{
			System.out.println(file.getOriginalFilename());
			System.out.println(file.getContentType());
			System.out.println(file.getSize());
			if(file.isEmpty())
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("File is empty");
			}
			
			
			boolean status = fileUploadingServices.fileUpload(file);
			System.out.println(status);
			if(status)
			{
				return ResponseEntity.ok("File Uploaded sucessfuly...");
			}
				
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went  wrong! Please try again later");
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went  wrong! Please try again later");
	}
	

}
