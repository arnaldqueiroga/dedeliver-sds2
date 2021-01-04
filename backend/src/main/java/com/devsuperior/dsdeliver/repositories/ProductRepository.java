package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	//Criando método auxiliar para buscar produtos por nome
	List<Product> findAllByOrderByNameAsc();

}
