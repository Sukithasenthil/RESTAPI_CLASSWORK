package com.example.demo.day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class day2_value {
@Value("SUKITHA")
public String name;
@RequestMapping("/namely")
public String namely() {
	return name;
}
}
