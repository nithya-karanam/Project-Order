package com.infosys.project.order.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.infosys.project.order.repository.OrderRepository;
import com.infosys.project.order.repository.ProductsOrderedRepo;
import com.infosys.project.order.dto.OrderDTO;
import com.infosys.project.order.entity.OrderDetails;

@Service
public class OrderService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	OrderRepository orderRepo;
	@Autowired
	ProductsOrderedRepo productRepo;
	public List<OrderDTO> getOrderDetails() {

		List<OrderDetails> orders = orderRepo.findAll();
		List<OrderDTO> orderDTOs = new ArrayList<>();

		for (OrderDetails order:orders) {
			OrderDTO orderDTO = OrderDTO.valueOf(order);
			orderDTOs.add(orderDTO);
		}
		logger.info("Order details : {}", orderDTOs);
		return orderDTOs;
	}
	public OrderDTO getSpecificOrder(int orderid) {
		logger.info("Order details : {}", orderid);
		OrderDTO orderDTO=null;
		Optional<OrderDetails> optOrder=orderRepo.findById(orderid);
		if(optOrder.isPresent()) {
			OrderDetails orderDetails=optOrder.get();
	        orderDTO=OrderDTO.valueOf(orderDetails);
		}
		return orderDTO;
	}
	public void placeOrder(OrderDTO orderDTO) {
		logger.info("Order request for user {}", orderDTO);
		OrderDetails order = orderDTO.createEntity();
		orderRepo.save(order);
	}
	
}
