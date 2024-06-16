package com.codewithpiku.blog.services;

import com.codewithpiku.blog.payloads.CommentDto;

public interface CommentService {
  
	CommentDto createComment(CommentDto commentDto,Integer postId);
	void deleteComment(Integer commentId);
	
}
