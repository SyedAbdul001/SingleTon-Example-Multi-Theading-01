package com.tahauddin.syed.repo;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.tahauddin.syed.security.AppUser;

@Transactional
@Repository
public interface AppUserRepo{
	
	Optional<AppUser> findByUserEmail(String userEmail);

}
