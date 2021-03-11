package com.infosys.project.order.entity;

import java.io.Serializable;

import javax.annotation.sql.DataSourceDefinition;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductsOrderedIdusingIdClass implements Serializable {
	private int orderid;
	private int prodid;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	

}
