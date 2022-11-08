package com.zerobase.fastlms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage {
	
	@GetMapping
	public String indexi() {
		return "HELLO";
	}
}
