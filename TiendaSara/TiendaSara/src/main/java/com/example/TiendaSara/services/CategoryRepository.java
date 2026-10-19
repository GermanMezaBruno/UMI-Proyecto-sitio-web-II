package com.example.TiendaSara.services;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.TiendaSara.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
