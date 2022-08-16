package com.SpringBootLearning.SmartContactManager.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping("/adminDashbord")
	public String upenDashboard()
	{
		System.out.println("admin dashboard");
		return "scm_admin/adminDashboard";
	}
}
