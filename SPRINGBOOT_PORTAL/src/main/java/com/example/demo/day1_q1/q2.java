package com.example.demo.day1_q1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class q2 {
@Value("Suki")
public String name;
@RequestMapping("/welcome")
public String display() {
	return "Welcome "+name+" !";
}
}

