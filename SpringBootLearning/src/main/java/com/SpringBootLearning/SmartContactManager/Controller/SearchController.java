package com.SpringBootLearning.SmartContactManager.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.SpringBootLearning.SmartContactManager.Entities.User;
import com.SpringBootLearning.SmartContactManager.dao.UserRepository;

@Controller
public class SearchController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("search/{name}")
	public List searchData(Principal principple ,@PathVariable("name") String name)
	{
		System.out.println("name...."+name);
		User user=userRepository.getUserDetails(principple.getName());
		return null;
	}

}
