package com.institute.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

// HQL: select p from ProductEntity p where status=true  (HQL -> SQL)
// SQL: select * from prodinfo where isavailable=true;

@Entity
@Table(name = "prodinfo")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
	//@SequenceGenerator(name = "product_seq", initialValue = 1000, allocationSize = 1)
	private int id; 
	@Column(name = "prodname", length = 50, nullable = false, unique = true)
	private String name;
	@Column(name = "isavailable")
	private boolean status;
	private double price;
	private int quantity;
	@CreationTimestamp // Insert the Date and time whenever insert record into table
	private LocalDateTime createdDate;
	@UpdateTimestamp // Insert Date and time whenever insert/update record into table
	private LocalDateTime updatedDate;
	@Transient
	private double totalPrice;
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	public double getTotalPrice() {
		return price * quantity;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	

}






