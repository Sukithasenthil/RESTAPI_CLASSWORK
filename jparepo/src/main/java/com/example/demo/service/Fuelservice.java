package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.pertolbunk;
import com.example.demo.repository.Fuelrepo;

@Service
public class Fuelservice {
@Autowired
Fuelrepo frepo;
public pertolbunk saveDetails(pertolbunk p) {
	return frepo.save(p);
}
public List<pertolbunk> getDetails(){
	return frepo.findAll();
}
}
