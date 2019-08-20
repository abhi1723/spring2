package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="myOrder")
public class MyOrder {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int orderId;
	
	/*@ForeignKey ()
	int i_id;*/
	@Column (name="price")
	int price;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Ingredient getI() {
		return i;
	}
	public void setI(Ingredient i) {
		this.i = i;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
