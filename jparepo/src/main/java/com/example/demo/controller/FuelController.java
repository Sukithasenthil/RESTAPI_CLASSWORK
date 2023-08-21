package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.pertolbunk;
import com.example.demo.service.Fuelservice;

@RestController
public class FuelController {
	@Autowired
    Fuelservice fser;
	@PostMapping("/saverfuel")
	public pertolbunk saveFuelStationDe(@RequestBody pertolbunk pb) {
		return fser.saveDetails(pb);
	}
	@GetMapping("/get fuel")
	public List<pertolbunk> getfuelStationDe(){
		return fser.getDetails();
	}
}
