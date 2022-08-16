package com.SpringBootLearning.serverSideValidation;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ServerSideValidationController")
public class ServerSideValidationController {

	@GetMapping("/openForm")
	public String openForm(Model model)
	{
		model.addAttribute("myFormData", new UserForm());
		 List<String> professionList = Arrays.asList("Developer", "Designer", "Tester");
	     
		    model.addAttribute("professionList", professionList);
		System.out.println("form opening.....");
		return "ServerSideValidation/userForm";
	}
	
	@PostMapping("/formProcessing")
	public String formProcessing(@Valid @ModelAttribute("myFormData") UserForm myForm,BindingResult result,Model model)
	{
		System.out.println("form processing...");
		System.out.println(myForm);
		List<String> professionList = Arrays.asList("Developer", "Designer", "Tester");
	     
	    model.addAttribute("professionList", professionList);
		if(result.hasErrors())
		{
			System.out.println(result);
			
			result.getAllErrors().forEach(err -> {
	                System.out.println(err.getDefaultMessage());
	            });
			//model.addAttribute("myFormData", myForm);
			return  "ServerSideValidation/userForm";
		}
		return "success";
	}
}
