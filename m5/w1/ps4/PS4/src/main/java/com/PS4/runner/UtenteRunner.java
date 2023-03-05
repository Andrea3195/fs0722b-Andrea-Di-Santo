package com.PS4.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.PS4.service.UtenteService;

@Component
public class UtenteRunner implements ApplicationRunner {

	@Autowired
	UtenteService utenteService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("UtenteRun...");
	
	}

}
