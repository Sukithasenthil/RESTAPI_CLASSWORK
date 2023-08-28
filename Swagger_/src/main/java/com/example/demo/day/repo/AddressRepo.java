package com.example.demo.day.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.day.model.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
