package com.codewithpiku.blog.payloads;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class PostResponse {
  private List<PostDto>content;
  private int pageNumber;
  private long totalElements;
  private int totalPages;
  private boolean lastPage;
  private int pageSize;
  
  
  
  
}
