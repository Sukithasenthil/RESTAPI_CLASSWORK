package com.example.demo.day8.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.day8.Model.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
