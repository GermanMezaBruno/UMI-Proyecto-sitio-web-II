package com.example.TiendaSara.services;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.TiendaSara.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
