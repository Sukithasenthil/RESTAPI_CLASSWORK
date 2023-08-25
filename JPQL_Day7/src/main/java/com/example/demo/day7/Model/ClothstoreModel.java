package com.example.demo.day7.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Clothstore")
public class ClothstoreModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int storeId;
@Column(name="storename")
private String storeName;
private String place;
private int price;
public int getStoreId() {
	return storeId;
}
public void setStoreId(int storeId) {
	 this.storeId = storeId;
}
public String getStoreName() {
	return storeName;
}
public void setStoreName(String storeName) {
	this.storeName = storeName;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
