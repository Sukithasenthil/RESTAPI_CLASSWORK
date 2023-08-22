package com.example.demo.day1_q1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class q3 {
@Value("Purple")
public String color;
@RequestMapping("/color")
public String display() {
	return "My favourite color is "+color+".";
}
}
