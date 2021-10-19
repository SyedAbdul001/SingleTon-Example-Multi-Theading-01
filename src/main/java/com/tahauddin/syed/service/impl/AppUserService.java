package com.tahauddin.syed.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.tahauddin.syed.repo.AppUserRepo;

public class AppUserService implements UserDetailsService {
	
	private static final String USER_NOT_FOUND = "User With Email %s Is Not Found"; 
	
	@Autowired
	private AppUserRepo appUserRepo;

	@Override
	public UserDetails loadUserByUsername(String email) 
			throws UsernameNotFoundException {
		return appUserRepo.findByUserEmail(email).orElseThrow(
				() -> new UsernameNotFoundException(String.format(USER_NOT_FOUND, email))
				);
	}

}
