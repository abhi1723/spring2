package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Ingredient")
public class Ingredient {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	@Column(name="cheese")
	int cheese;
	
	@Column(name = "salad")
	int salad;
	
	@Column(name ="becon")
	int becon;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCheese() {
		return cheese;
	}
	public void setCheese(int cheese) {
		this.cheese = cheese;
	}
	public int getSalad() {
		return salad;
	}
	public void setSalad(int salad) {
		this.salad = salad;
	}
	public int getBecon() {
		return becon;
	}
	public void setBecon(int becon) {
		this.becon = becon;
	}
	
}
