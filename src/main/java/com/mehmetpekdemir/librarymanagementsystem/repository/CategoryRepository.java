package com.mehmetpekdemir.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmetpekdemir.librarymanagementsystem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
