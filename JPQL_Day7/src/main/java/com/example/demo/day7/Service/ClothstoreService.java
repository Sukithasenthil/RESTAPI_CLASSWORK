package com.example.demo.day7.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.day7.Model.ClothstoreModel;
import com.example.demo.day7.Repo.ClothstoreRepo;

@Service
public class ClothstoreService {
@Autowired
public ClothstoreRepo srepo;
public List<ClothstoreModel> getStore(){
	return srepo.findAll();
}
public ClothstoreModel updateStore(ClothstoreModel hm) {
	return srepo.saveAndFlush(hm);
}
//get all the data
	public List<ClothstoreModel> getAllrows()
	{
		return srepo.getAllrows();
	}
	
	//get specific rows
	public List<ClothstoreModel> getSpecrows(String bran,String name)
	{
		return srepo.getSpecrows(bran, name);
	}
	//delete the data
	public int deleteRowByid(int id) {
		return srepo.deleteId(id);
	}
	//update the data
	public Integer updateRow(String bran,int id) {
		return srepo.updateByid(bran, id);
	}
	//JQL query
	public List<ClothstoreModel> getByname(String name){
		return srepo.getByname(name);
	}
}
