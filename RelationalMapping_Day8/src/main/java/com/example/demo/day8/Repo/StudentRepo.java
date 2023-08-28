package com.example.demo.day8.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.day8.Model.StudentModel;

public interface StudentRepo extends JpaRepository<StudentModel, Integer>{

}
