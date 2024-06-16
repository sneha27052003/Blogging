package com.codewithpiku.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithpiku.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
