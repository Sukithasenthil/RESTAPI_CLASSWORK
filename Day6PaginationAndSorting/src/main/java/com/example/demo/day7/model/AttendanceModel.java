package com.example.demo.day7.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Attendance")
public class AttendanceModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int stuId;
@Column(name="stuname")
private String stuName;
private String address;
private String phn;

public int getStuId() {
	return stuId;
}
public void setStuId(int stuId) {
	this.stuId = stuId;
}
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhn() {
	return phn;
}
public void setPhn(String phn) {
	this.phn = phn;
}


}
