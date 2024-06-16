package com.codewithpiku.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.codewithpiku.blog.entities.Category;
import com.codewithpiku.blog.entities.Post;
import com.codewithpiku.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	List<Post> findAllByUser(User user);
	List<Post> findByCategory(Category category);
	@Query("select p from Post p where p.title like :key")
	List<Post>searchByTitle(@Param("key") String title);
	

}
