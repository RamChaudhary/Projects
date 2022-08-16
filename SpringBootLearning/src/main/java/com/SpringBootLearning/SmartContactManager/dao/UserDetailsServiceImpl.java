package com.SpringBootLearning.SmartContactManager.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.SpringBootLearning.SmartContactManager.Entities.User;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.getUserDetails(username);
		System.out.println("username..==="+username);
		System.out.println("user dtl==="+user);

		if(user==null)
		{
			throw new UsernameNotFoundException("Could not found user !!");
		}
		CustomUserDetails userdtl=new CustomUserDetails(user);
		return userdtl;
	}

}
