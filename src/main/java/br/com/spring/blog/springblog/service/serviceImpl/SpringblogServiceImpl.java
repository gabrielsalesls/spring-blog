package br.com.spring.blog.springblog.service.serviceImpl;

import br.com.spring.blog.springblog.model.Post;
import br.com.spring.blog.springblog.repository.SpringBlogRepository;
import br.com.spring.blog.springblog.service.SpringblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpringblogServiceImpl implements SpringblogService {

    @Autowired
    SpringBlogRepository springBlogRepository;

    @Override
    public List<Post> findAll() {
        return springBlogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return springBlogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return springBlogRepository.save(post);
    }

}
