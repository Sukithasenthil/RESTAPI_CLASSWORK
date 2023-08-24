package com.example.demo.day7.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.day7.Repo.flowerRepo;

import com.example.demo.day7.model.flowerModel;



@Service
public class flowerService {
@Autowired
public flowerRepo frepo;
public String saveAttendance(flowerModel f) {
	frepo.save(f);
	return "Data is saved to database";
}
public List<flowerModel> sortByAsc(String name)
{
	return frepo.findAll(Sort.by(name).ascending());
}

public List<flowerModel> sortByDsc(String name)
{
	return frepo.findAll(Sort.by(name).descending());
}
//pagination
public List<flowerModel> pagination(int pageNu,int pageSize)
{
	Page<flowerModel> cont= frepo.findAll(PageRequest.of(pageNu, pageSize));
	return cont.getContent();
}
//sorting
public List<flowerModel> paginationAndSorting(int pagNu,int pageSize,String name)
{
	Page<flowerModel> cont1=frepo.findAll(PageRequest.of(pagNu, pageSize,Sort.by(name)));
	return cont1.getContent();
}
}


