package com.trustnet.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.trustnet.dto.UserPrincipal;
import com.trustnet.entity.User;
import com.trustnet.repo.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail).orElseThrow(
				() -> new UsernameNotFoundException("User not found with username or email : " + usernameOrEmail)); // throw
																													// if
																													// not
																													// found
																													// in
																													// DB

		return UserPrincipal.create(user);
		/*
		 * Set grantedAuthorities = new HashSet<>();
		 * 
		 * UserType userType = user.getUserType(); grantedAuthorities.add(new
		 * SimpleGrantedAuthority("ROLE_" +userType.getType()));
		 * 
		 * UserPlanCode userPlanCode = user.getUserPlanCode();
		 * grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_"
		 * +userPlanCode.getUserCode()));
		 * 
		 * return new
		 * org.springframework.security.core.userdetails.User(user.getUsername(),
		 * user.getPassword(), grantedAuthorities);
		 */

	}

	// This method is used by JWTAuthenticationFilter
	@Transactional
	public UserDetails loadUserById(String id) {
		User user = userRepository.findById(id)
				.orElseThrow(() -> new UsernameNotFoundException("User not found with id : " + id));

		return UserPrincipal.create(user);
	}

}
