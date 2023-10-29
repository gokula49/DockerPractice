package com.example.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Samplecontroller {
    @GetMapping("/gokula")
	public String simple(){
		return "Hey";
	}
}
