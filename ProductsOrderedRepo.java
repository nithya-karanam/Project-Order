package com.infosys.project.order.repository;
//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.infosys.project.order.entity.ProductsOrdered;

public interface ProductsOrderedRepo extends JpaRepository<ProductsOrdered, Integer>{

}
