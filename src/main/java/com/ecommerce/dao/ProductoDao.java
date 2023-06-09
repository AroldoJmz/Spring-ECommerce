package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Producto;

@Repository
public interface ProductoDao extends JpaRepository<Producto, Integer>{
	
}
