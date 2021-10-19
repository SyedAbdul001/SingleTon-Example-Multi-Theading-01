package com.tahauddin.syed.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/registration")
@AllArgsConstructor
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	public String register(@RequestBody RegistrationRequest request) {
		
		
		return registrationService.register(request);
	}
	

}
