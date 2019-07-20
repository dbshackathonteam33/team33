package com.team33.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	@GetMapping("smiles")
	public String getWorking() {
		return "Smiles";
	}

}
