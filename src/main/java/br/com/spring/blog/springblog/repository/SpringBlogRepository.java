package br.com.spring.blog.springblog.repository;

import br.com.spring.blog.springblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringBlogRepository extends JpaRepository<Post, Long> {

}
