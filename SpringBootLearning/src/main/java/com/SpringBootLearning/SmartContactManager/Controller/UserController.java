package com.SpringBootLearning.SmartContactManager.Controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.SpringBootLearning.SmartContactManager.Entities.Contacts;
import com.SpringBootLearning.SmartContactManager.Entities.User;
import com.SpringBootLearning.SmartContactManager.dao.UserRepository;

@Controller
@RequestMapping("/user")
@CrossOrigin
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@ModelAttribute
	public void UserInfo(Model model,Principal principal)
	{
		System.out.println("user common info");
		String userEmail = principal.getName();
		System.out.println("userEmail==="+userEmail);
		User logInUserDtl = userRepository.getUserDetails(userEmail);
		System.out.println(logInUserDtl);
		model.addAttribute("userDtl", logInUserDtl);
	}
	
	@RequestMapping("/userDashbord")
	public String upenDashboard(Model model,Principal principal)
	{
		System.out.println("user dashboard");

		
		return "scm_normalUser/userDashboard";
	}
	
	@RequestMapping("/addContact")
	public String AddContact(Model model,Principal principal)
	{
		
		
		return "scm_normalUser/contact";
	}
	
	@PostMapping("/saveContact")
	public String saveContactDtl(@ModelAttribute Contacts contactDtl
			,@RequestParam("profileImage") MultipartFile profileImg
			,Model model,Principal principle)
	{
		System.out.println(contactDtl);
		try
		{
		String userId = principle.getName();
		User userDetails = userRepository.getUserDetails(userId);
		System.out.println("user dtl==="+userDetails);
		
		userDetails.getContact().add(contactDtl);
		contactDtl.setUser(userDetails);

		if(!profileImg.isEmpty())
		{
			System.out.println("file uploading...");
			String fileUploadPath = userRepository.getFileUploadPath();
			String orgFile="";
			
			orgFile=profileImg.getOriginalFilename();
			System.out.println("orgFile="+orgFile);
			Path path = Paths.get(fileUploadPath+File.separator+profileImg.getOriginalFilename());
			Files.copy(profileImg.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
			contactDtl.setImage(path.toString());
		}
		
		
		User save = userRepository.save(userDetails);
		System.out.println("saved data==="+save);
		model.addAttribute("save", "S");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "scm_normalUser/contact";
	}
	
	@GetMapping("/viewContact/{page}")
	public String viewContact(@PathVariable("page") int page,Model model, Principal priciple)
	{
		String name = priciple.getName();
		User userDetails = userRepository.getUserDetails(name);
		
		Pageable pageable = PageRequest.of(page, 5);
		Page<Contacts> contactDetails = userRepository.getContactsByUser(userDetails.getId(),pageable);
		
		model.addAttribute("userContactDetails", contactDetails.getContent());
		model.addAttribute("currentPage", page);
		model.addAttribute("totalPage", contactDetails.getTotalPages());
		return "scm_normalUser/viewContact";
	}
	
	@GetMapping("/deleteContact/{id}")
	public String deleteContact(Model model,@PathVariable("id") int id)
	{
		System.out.println("id=="+id);
		int status = userRepository.deleteContactById(id);
		if(status==1)
		{
			model.addAttribute("deleteStatus", "S");
		}else
		{
			model.addAttribute("deleteStatus", "E");
		}
		
		return "redirect:/user/viewContact/0";
	}
	
	@GetMapping("/viewsContact/{id}")
	public String  viewsContact(@PathVariable("id") int id,Model  model,Principal priciple)
	{
		System.out.println("contact id=="+id);
		String userEmail = priciple.getName();
		List<Contacts> contactsByUser = userRepository.getContactsByUser(id);
		model.addAttribute("contactDtl", contactsByUser);
		
		return "scm_normalUser/showContactDtl";
	}
}
