package com.example.demo.day7.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.day7.Model.ClothstoreModel;

import jakarta.transaction.Transactional;

public interface ClothstoreRepo extends JpaRepository<ClothstoreModel, Integer> {
	

	
	//native query
		@Query(value="select * from Clothstore",nativeQuery = true )
		public List<ClothstoreModel>getAllrows();

		@Query(value="select * from Clothstore where place=:bran and storeName=:name",nativeQuery = true )
		public List<ClothstoreModel> getSpecrows(@Param("bran") String bran,@Param("name") String name);
	//:
		//@Query(value="select * from Clothstore where place like %?1%",nativeQuery=true)
		@Query("Select h from ClothstoreModel h where h.storeName like %?1%")
		public List<ClothstoreModel> getByname(@Param("name") String name);
		
	//Delete using native query
		@Modifying
		@Transactional
		//@Query(value = "delete from Clothstore where store_id=:id",nativeQuery=true)
		@Query("Delete from ClothstoreModel h where h.storeId=:id")
		public int deleteId(@Param("id") int id);
		
	//Update the native query
			@Modifying
			@Transactional
			@Query(value="update Cloth set place=:bran where store_id=:id",nativeQuery=true)
			public Integer updateByid(@Param("bran") String bran,@Param("id")int id);
}
