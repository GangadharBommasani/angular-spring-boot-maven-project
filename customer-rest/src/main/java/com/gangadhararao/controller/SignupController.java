package com.gangadhararao.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gangadhararao.converter.SingupConverter;
import com.gangadhararao.domain.SignupRequest;
import com.gangadhararao.domain.SignupResponse;
import com.gangadhararao.entity.Signup;
import com.gangadhararao.repository.SignupRepository;

@Controller
public class SignupController {
	
	private static final Logger LOG = LoggerFactory.getLogger(SignupController.class);
	
	@Autowired
	private SingupConverter singupConverter;
	
	@Autowired
	private SignupRepository signupRepository;

	@RequestMapping(path="/registerUser", method= RequestMethod.POST, produces=MediaType.APPLICATION_JSON_UTF8_VALUE,
				consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public SignupResponse registerUser(@RequestBody SignupRequest signupRequest) {
		LOG.info("process register user details {}", signupRequest);
		Signup singup = singupConverter.convert(signupRequest);
		signupRepository.createRegister(singup);
		return new SignupResponse(HttpStatus.OK.value(), "Sign up process is successful.");
	}

}
