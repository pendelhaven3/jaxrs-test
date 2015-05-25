package com.pj.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

	public String getGreeting() {
		return "Mabuhay {0}!";
	}
	
}