package com.SpringBootLearning.SmartContactManager.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringBootLearning.SmartContactManager.Entities.User;
import com.SpringBootLearning.SmartContactManager.dao.UserRepository;

@Controller
@RequestMapping("/ContactManagerController")
public class ContactManagerController {

	@Autowired
	 private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@GetMapping("/Home")
	public String OpenHome()
	{
		
		return "smartContactManager/BeforeLogInHome";
	}
	
	@RequestMapping("/signUp")
	public String signUp(Model model)
	{
		model.addAttribute("formError", new User());
		return "smartContactManager/signUp";
	}
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute User user,BindingResult errorBinding,@RequestParam(value = "agreement",defaultValue = "false") boolean agreement,Model model)
	{
		try {
			if(errorBinding.hasErrors())
			{
				model.addAttribute("user", user);
				model.addAttribute("formError", "formValidation");
				return "smartContactManager/signUp";
			}
			model.addAttribute("user", user);
			System.out.println(user);
			System.out.println(agreement);
			if(!agreement)
			{
				
				model.addAttribute("errorMsg", "Agri");
				return "smartContactManager/signUp";
			}
			int checkUserExist = userRepository.checkUserExist(user.getUserEmail());
			System.out.println("checkUserExist==="+checkUserExist);
			if(checkUserExist>=1)
			{
				model.addAttribute("errorMsg", "userExist");
				return "smartContactManager/signUp";
			}
			user.setEnable(true);
			user.setProfileImage("default.png");
			user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
			User result=userRepository.save(user);
			System.out.println(result);
			model.addAttribute("errorMsg", "S");
			model.addAttribute("user",new User());
			
		} catch (Exception e) {
			// TODO: handle exception
			model.addAttribute("errorMsg", "Exception");
			model.addAttribute("errorMsgBody", "Error:-"+e.getMessage());
		}
		
		return "smartContactManager/signUp";
	}
	
	@GetMapping("/logInForm")
	public String logInFormOpen()
	{
	
		return  "smartContactManager/logIn";
	}
	
}
