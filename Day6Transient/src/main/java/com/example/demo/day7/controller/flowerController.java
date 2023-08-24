package com.example.demo.day7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.day7.Service.flowerService;

import com.example.demo.day7.model.flowerModel;


@RestController
public class flowerController {
@Autowired
public flowerService fserv;
@PostMapping("/postflower")
public String postAttendance(@RequestBody  flowerModel ar)
{
	fserv.saveAttendance(ar);
	return "data saved";
}
@GetMapping("/sortAsc/{name}")
public List<flowerModel> sortasc(@PathVariable("name")String flowname)
{
	  return fserv.sortByAsc(flowname);
}

@GetMapping("/sortDesc/{name}")
public List<flowerModel> sortdsc(@PathVariable("name")String name)
{
	  return fserv.sortByDsc(name);
}
//pagination
@GetMapping("/pagination/{num}/{size}")
public List<flowerModel> pagination(@PathVariable("num") int num,@PathVariable("size") int size){
	return fserv.pagination(num, size);
}
@GetMapping("/pagination/{num}/{size}/{name}")
public List<flowerModel> paginationAndSorting(@PathVariable("num") int num,@PathVariable("size") int size,@PathVariable("name") String name){
	return fserv.paginationAndSorting(num, size, name);
}
}


