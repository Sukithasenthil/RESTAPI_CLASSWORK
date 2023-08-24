package com.example.demo.day7.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.day7.model.flowerModel;

public interface flowerRepo extends JpaRepository<flowerModel, Integer> {

}
