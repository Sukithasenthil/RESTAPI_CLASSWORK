package com.example.demo.day7.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.day7.Model.ClothstoreModel;
import com.example.demo.day7.Service.ClothstoreService;

@RestController
public class Clothstorecontroller {
@Autowired
	public ClothstoreService sserv;
	//get mapping
	@GetMapping("/getStore")
		public List<ClothstoreModel>getStoreInfo()
		{
		return sserv.getStore();
		}
	@PutMapping("/updateStore")
	public ClothstoreModel updateToyInfo(@RequestBody ClothstoreModel ca)
	{
		return sserv.updateStore(ca);
	}
	//get all the data
	@GetMapping("/getAllrows")
	public List<ClothstoreModel> getAllrows()
	{
		 return sserv.getAllrows();
	}
	//get specific data
	@GetMapping("/getSpecific/{bran}/{name}")
	public List<ClothstoreModel> getSpecrows(@PathVariable("bran") String bran,@PathVariable("name") String name)
	{
		 return sserv.getSpecrows(bran, name);
	}
	//delete
	@DeleteMapping("/deleteRow/{id}")
	public String deleteRow(@PathVariable("id") int id) {
		 return sserv.deleteRowByid(id)+" id deleted";
	}

	//update
	@PutMapping("/updateId/{bran}/{id}")
	public String updateInfo(@PathVariable("bran") String bran,@PathVariable("id") int id)
	{
		 return sserv.updateRow(bran, id)+" rows are updated";
	}
	//jql query
	@GetMapping("/getjql/{name}")
	public List<ClothstoreModel> getByname (@PathVariable ("name") String name){
		return sserv.getByname(name);
	}

}
