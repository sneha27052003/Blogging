package com.codewithpiku.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithpiku.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
