package br.com.spring.blog.springblog.service;

import br.com.spring.blog.springblog.model.Post;

import java.util.List;

public interface SpringblogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
