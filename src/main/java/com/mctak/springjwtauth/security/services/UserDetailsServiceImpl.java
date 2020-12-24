package com.mctak.springjwtauth.security.services;

import javax.transaction.Transactional;

import com.mctak.springjwtauth.models.User;
import com.mctak.springjwtauth.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
	@Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {        
        
        User user = userRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

		return UserDetailsImpl.build(user);
    }
    
}
