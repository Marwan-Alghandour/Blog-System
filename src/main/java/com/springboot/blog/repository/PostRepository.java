package com.springboot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.blog.entity.Post;
import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByCategoryId(long categoryId);

    @Query("SELECT p FROM Post p WHERE " + "p.title LIKE CONCAT('%', :query, '%') "
            + "OR p.description LIKE CONCAT('%', :query, '%')")
    List<Post> searchPosts(String query);
}
