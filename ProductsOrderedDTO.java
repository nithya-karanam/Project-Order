package com.infosys.project.order.dto;

import java.math.BigDecimal;

import com.infosys.project.order.entity.OrderDetails;
import com.infosys.project.order.entity.ProductsOrdered;

public class ProductsOrderedDTO {
//private int buyerid;
private int prodid;
private int sellerid;
private int quantity;
private String status;
private BigDecimal price;

   public ProductsOrderedDTO() {
	   super();
   }
   public ProductsOrderedDTO(int prodid, int sellerid, int quantity, String status, BigDecimal price) {
	  // this.buyerid=buyerid;
	   this.prodid=prodid;
	   this.sellerid=sellerid;
	   this.quantity=quantity;
	   this.status=status;
	   this.price=price;
	  
   }
//public int getBuyerid() {
//	return buyerid;
//}
//public void setBuyerid(int buyerid) {
//	this.buyerid = buyerid;
//}
public int getProdid() {
	return prodid;
}
public void setProdid(int prodid) {
	this.prodid = prodid;
}
public int getSellerid() {
	return sellerid;
}
public void setSellerid(int sellerid) {
	this.sellerid = sellerid;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public BigDecimal getPrice() {
	return price;
}
public void setPrice(BigDecimal price) {
	this.price = price;
}
//coverts Entity to DTO
public static ProductsOrderedDTO valueOf(ProductsOrdered productDetails) {
	ProductsOrderedDTO porderedDTO = new ProductsOrderedDTO();
	//porderedDTO.setBuyerid(productDetails.getBuyerid());
	porderedDTO.setProdid(productDetails.getProdid());
	porderedDTO.setSellerid(productDetails.getSellerid());
	porderedDTO.setQuantity(productDetails.getQuantity());
	porderedDTO.setStatus(productDetails.getStatus());
	porderedDTO.setPrice(productDetails.getPrice());
	return porderedDTO;
}
   
}
