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

import com.example.demo.day.model.StudentModel;
import com.example.demo.day.repo.UserRepo;

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/")
public class Studentcontroller {
	@Autowired
	UserRepo srepo;
	@PostMapping()
	public StudentModel saveDetails(@RequestBody StudentModel am) {
		return srepo.save(am);
	}
	@GetMapping()
	@Tag(name="get Users",description= " get all users in database")
	public List<StudentModel> getDetails(){
		return srepo.findAll();
	}
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		srepo.deleteById(id);
		 return "the Id "+id+" is deleted";
	}
}
