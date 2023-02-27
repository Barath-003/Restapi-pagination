package com.example.color.testentity;

import jakarta.persistence.*;

@Entity
@Table(name="Testdemo")

public class testentity {
	@Id
	
	private int id;
	private String name;
	private String author;
	private float price ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author = author;
	}
	public float getprice() {
		return price;
	}
	public void setprice(float price) {
		this.price = price;
	}
	public testentity(int id,String name,String author,float price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public testentity(){

	}
	public String toString() {
		return "id="+id+"name="+name+"author="+author+"price="+price;
	}
	
	
}

