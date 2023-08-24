package com.example.demo.day7.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.day7.model.AttendanceModel;

public interface AttendanceRepo extends JpaRepository<AttendanceModel, Integer>{

}