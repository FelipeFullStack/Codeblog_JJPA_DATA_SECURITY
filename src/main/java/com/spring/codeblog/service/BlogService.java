package com.spring.codeblog.service;

import com.spring.codeblog.model.Post;

import java.util.List;

public interface BlogService {

    List<Post> findAll();

    Post findById(Long id);

    Post save(Post post);
}