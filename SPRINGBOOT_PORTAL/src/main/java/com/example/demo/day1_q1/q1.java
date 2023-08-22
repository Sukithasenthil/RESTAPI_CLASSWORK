package com.example.demo.day1_q1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class q1 {
@Value("Welcome Spring")
public String name;
@RequestMapping("/display")
public String display() {
	return name;
}
}
