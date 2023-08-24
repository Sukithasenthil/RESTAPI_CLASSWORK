package com.example.demo.day7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.demo.day7.model.AttendanceModel;
import com.example.demo.day7.repo.AttendanceRepo;

@Service
public class AttendanceService {
@Autowired
public AttendanceRepo arepo;
public String saveAttendance(AttendanceModel a) {
	arepo.save(a);
	return "Data is saved to database";
}
public List<AttendanceModel> sortByAsc(String name)
{
	return arepo.findAll(Sort.by(name).ascending());
}

public List<AttendanceModel> sortByDsc(String name)
{
	return arepo.findAll(Sort.by(name).descending());
}
//pagination
public List<AttendanceModel> pagination(int pageNu,int pageSize)
{
	Page<AttendanceModel> cont= arepo.findAll(PageRequest.of(pageNu, pageSize));
	return cont.getContent();
}
//sorting
public List<AttendanceModel> paginationAndSorting(int pagNu,int pageSize,String name)
{
	Page<AttendanceModel> cont1=arepo.findAll(PageRequest.of(pagNu, pageSize,Sort.by(name)));
	return cont1.getContent();
}
}
