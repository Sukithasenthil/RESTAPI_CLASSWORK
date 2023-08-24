package com.example.demo.day7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.day7.model.AttendanceModel;
import com.example.demo.day7.service.AttendanceService;

@RestController
public class AttendanceController {
@Autowired
public AttendanceService aserv;
@PostMapping("/postAttendance")
public String postAttendance(@RequestBody  AttendanceModel ar)
{
	aserv.saveAttendance(ar);
	return "data saved";
}
@GetMapping("/sortAsc/{name}")
public List<AttendanceModel> sortasc(@PathVariable("name")String stuname)
{
	  return aserv.sortByAsc(stuname);
}

@GetMapping("/sortDesc/{name}")
public List<AttendanceModel> sortdsc(@PathVariable("name")String name)
{
	  return aserv.sortByDsc(name);
}
//pagination
@GetMapping("/pagination/{num}/{size}")
public List<AttendanceModel> pagination(@PathVariable("num") int num,@PathVariable("size") int size){
	return aserv.pagination(num, size);
}
@GetMapping("/pagination/{num}/{size}/{name}")
public List<AttendanceModel> paginationAndSorting(@PathVariable("num") int num,@PathVariable("size") int size,@PathVariable("name") String stuname){
	return aserv.paginationAndSorting(num, size, stuname);
}
}
