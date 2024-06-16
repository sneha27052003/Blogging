package com.codewithpiku.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithpiku.blog.entities.Comment;
import com.codewithpiku.blog.payloads.ApiResponse;
import com.codewithpiku.blog.payloads.CommentDto;
import com.codewithpiku.blog.services.CommentService;

@RestController
@RequestMapping("/api/")
public class CommentController {
	@Autowired
	private CommentService commentService;
	
	@PostMapping("/post/{postId}/comments")
  public ResponseEntity<CommentDto>createComment(@RequestBody CommentDto comment,@PathVariable Integer postId)
  {
	CommentDto createcomment = this.commentService.createComment(comment, postId);
	return new ResponseEntity<CommentDto>(createcomment,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/comments/{commentId}")
	  public ResponseEntity<ApiResponse> deleteComment(@PathVariable Integer commentId)
	  {
		this.commentService.deleteComment(commentId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Comment Deleted Successfully", true),HttpStatus.OK);
		}
	
	
	
}
