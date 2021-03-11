package com.infosys.project.order.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int orderid;
	@Column(nullable = false)
	int buyerid;
	@Column(nullable = false)
	BigDecimal amount;
	@Column(nullable = false)
	Date date;
	@Column(nullable = false)
	String address;
	@Column(nullable = false)
	String status;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="orderid",nullable=false,insertable=false,updatable=false)
List<ProductsOrdered> ProductsOrdered= new ArrayList<ProductsOrdered>();


	

	public List<ProductsOrdered> getProductsOrdered() {
		return ProductsOrdered;
	}

	public void setProductsOrdered(List<ProductsOrdered> productsOrdered) {
		ProductsOrdered = productsOrdered;
	}

	public OrderDetails() {
		super();
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getBuyerid() {
		return buyerid;
	}

	public void setBuyerid(int buyerid) {
		this.buyerid = buyerid;
	}

	
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
