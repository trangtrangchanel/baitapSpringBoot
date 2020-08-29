package com.anhduc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name ="phone")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class SmartPhone {
	
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String namePhone;
   private String price;
   private String company;
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNamePhone() {
	return namePhone;
}
public void setNamePhone(String namePhone) {
	this.namePhone = namePhone;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}

   
}
