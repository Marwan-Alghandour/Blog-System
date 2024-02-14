package com.springboot.blog.service;

import java.util.List;

import com.springboot.blog.payload.PostDto;
import com.springboot.blog.payload.PostResponse;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageSize, int pageNo, String sortBy, String sortDir);

    PostDto getPostById(long id);

    List<PostDto> getPostsByCategory(long categoryId);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);

    List<PostDto> searchPosts(String query);
}
