package com.example.demo.day.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.day.model.StudentModel;

public interface UserRepo extends JpaRepository<StudentModel, Integer>{

}
