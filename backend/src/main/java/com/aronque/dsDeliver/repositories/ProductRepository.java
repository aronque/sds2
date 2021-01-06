package com.aronque.dsDeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aronque.dsDeliver.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	List<Product> findAllByOrderByNameAsc();
}
