package com.example.demo.day7.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="Flower")
public class flowerModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flowId;
	@Column(name="flowername")
	private String flowerName;
	private int price;
	@Transient
	private String phn;
	public int getFlowId() {
		return flowId;
	}
	public void setFlowId(int flowId) {
		this.flowId = flowId;
	}
	public String getFlowerName() {
		return flowerName;
	}
	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPhn() {
		return phn;
	}
	public void setPhn(String phn) {
		this.phn = phn;
	}
	
}
