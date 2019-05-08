package com.gangadhararao.converter;

import org.springframework.stereotype.Component;

import com.gangadhararao.common.Converter;
import com.gangadhararao.domain.SignupRequest;
import com.gangadhararao.entity.Signup;

@Component
public class SingupConverter implements Converter<SignupRequest, Signup>  {

	@Override
	public Signup convert(SignupRequest signupRequest) {
		Signup signup = new Signup();
		signup.setEmail(signupRequest.getEmail());
		signup.setPassword(signupRequest.getPassword());
		signup.setFullName(signupRequest.getFullName());
		return signup;
	}

}
