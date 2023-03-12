package com.PS5.security.service;

import com.PS5.security.payload.LoginDto;
import com.PS5.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
