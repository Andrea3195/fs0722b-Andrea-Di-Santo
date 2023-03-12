package com.PS5.functionality.device;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.PS5.functionality.user.UserService;

@Component
public class DeviceRunner implements ApplicationRunner {

	@Autowired
	DeviceService dispService;
	@Autowired
	UserService userService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Run...");
	}
}