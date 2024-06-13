package com.project.quizapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.quizapp.dao.UsersDao;
import com.project.quizapp.model.UserPrincipal;
import com.project.quizapp.model.users;

@Service
public  class MyUserDetailsService implements UserDetailsService {

	@Autowired
   private UsersDao userDao;

	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		users u = userDao.findByUsername(username);
		if(u==null) 
			throw new UsernameNotFoundException("User not Found");
		
			return new UserPrincipal(u);
	}

}
