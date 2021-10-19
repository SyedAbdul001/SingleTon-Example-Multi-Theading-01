package com.tahauddin.syed.registration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class RegistrationRequest {
	
	private final String firstName;
	private final String lastName;
	private final String email;
	private final String password;

}
