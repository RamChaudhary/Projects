package com.SpringBootLearning.FileUploadin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadingServices {

	private final String UPLOAD_DIR="C:\\Users\\Bhram\\Desktop\\study\\file upload";
	
	public boolean fileUpload(MultipartFile file)
	{
		boolean status=false;
		try {
			
			InputStream is = file.getInputStream();
			byte data[]=new byte[is.available()];
			 is.read(data);
			 
			 FileOutputStream fos=new FileOutputStream(UPLOAD_DIR+File.separator+file.getOriginalFilename());
			 fos.write(data);
			 
			 fos.flush();
			 fos.close();
			status=true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return status;
	}
}
