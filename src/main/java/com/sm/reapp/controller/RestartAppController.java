package com.sm.reapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sm.reapp.SpringbootRestartAppManualApplication;

@RestController
public class RestartAppController {
	
	@Value("${message}")
	private String message;

	@GetMapping("/restart")
	public String restartApplication() {
		SpringbootRestartAppManualApplication.restart();
		return "application restart";
	}
	
	@GetMapping("hello")
	public String getMessage() {
		return "message from property file :: "+message;
	}
}
