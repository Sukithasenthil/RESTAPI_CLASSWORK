package com.example.demo.day.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.day.Model.Users;
import com.example.demo.day.Repo.UserRepo;



@RestController
@RequestMapping("/")
public class UserController {
@Autowired
UserRepo urepo;
@PostMapping()
public Users saveDetails(@RequestBody Users am) {
	return urepo.save(am);
}
@GetMapping()
public List<Users> getDetails(){
	return urepo.findAll();
}
@DeleteMapping("/{id}")
public String deleteStudent(@PathVariable("id") int id) {
	 return "the Id "+id+" is deleted";
}

}
