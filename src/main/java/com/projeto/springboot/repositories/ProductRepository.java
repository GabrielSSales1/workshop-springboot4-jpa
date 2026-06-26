package com.projeto.springboot.repositories;

import com.projeto.springboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
