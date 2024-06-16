package com.codewithpiku.blog.services;

import java.util.List;

import com.codewithpiku.blog.payloads.CategoryDto;

public interface CategoryService {

	 CategoryDto createCategory(CategoryDto categoryDto);
	 CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	 public void deleteCategory(Integer categoryId);
	  CategoryDto getCategory(Integer categoryId);
	 List<CategoryDto>getCategories();
	 
	 
}
