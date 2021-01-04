package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	//Método personalizado para retornar somente os pedidos pendentes e que estejam ordenados por instante(mais antigo para o mais recente) - Vídeo 01 - 01:48:01
	@Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products"
			+ " WHERE obj.status = 0 ORDER BY obj.moment ASC") // Escrevendo a nossa própria consulta
	List<Order> findOrdersWithProducts();
	

}
