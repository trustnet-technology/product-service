package com.trustnet.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trustnet.config.JwtTokenProvider;
import com.trustnet.dto.ApiResponse;
import com.trustnet.dto.JwtAuthenticationResponse;
import com.trustnet.dto.LoginRequest;
import com.trustnet.dto.SignUpRequest;
import com.trustnet.entity.User;
import com.trustnet.repo.UserRepository;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserRepository userRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	JwtTokenProvider tokenProvider;

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsernameOrEmail(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);

		String jwt = tokenProvider.generateToken(authentication);
		return ResponseEntity.ok(new JwtAuthenticationResponse(jwt));
	}

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {
		/*
		 * if (userRepository.existsByUsername(signUpRequest.getUsername())) { return
		 * new ResponseEntity(new ApiResponse(false, "Username is already taken!"),
		 * HttpStatus.BAD_REQUEST); }
		 * 
		 * if (userRepository.existsByEmailId(signUpRequest.getEmail())) { return new
		 * ResponseEntity(new ApiResponse(false, "Email Address already in use!"),
		 * HttpStatus.BAD_REQUEST); }
		 */

		// Creating user's account
		User user = new User();
		user.setFirstName(signUpRequest.getName());
		user.setEmail(signUpRequest.getEmail());
		user.setUsername(signUpRequest.getUsername());
		user.setPassword(signUpRequest.getPassword());
		user.setPhoneNum(signUpRequest.getPhoneNum());

		user.setPassword(passwordEncoder.encode(user.getPassword()));

//        Role userRole = roleRepository.findByName(RoleName.ROLE_USER)
//                .orElseThrow(() -> new AppException("User Role not set."));

		User result = userRepository.save(user);

//        URI location = ServletUriComponentsBuilder
//                .fromCurrentContextPath().path("/api/users/{username}")
//                .buildAndExpand(result.getUsername()).toUri();

		return new ResponseEntity(new ApiResponse(true, "User registered successfully"), HttpStatus.CREATED);
	}
}
