package br.com.spring.blog.springblog.utils;

import br.com.spring.blog.springblog.model.Post;
import br.com.spring.blog.springblog.repository.SpringBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class GenerateData {

    @Autowired
    SpringBlogRepository springBlogRepository;

    //@PostConstruct
    public void savePosts(){
        List<Post> postList = new ArrayList<>();

        Post post1 = new Post();
        post1.setAutor("Gabriel Sales");
        post1.setData(LocalDate.now());
        post1.setTitulo("Spring Boot");
        post1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis varius imperdiet mi, a faucibus nibh tristique sed. Duis lectus nisi, congue in nisi eget, fermentum ullamcorper metus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Phasellus hendrerit aliquam tellus, sed pellentesque nisl sodales nec. Suspendisse potenti. Donec in vehicula felis, sed tempor arcu. Donec sit amet vehicula nibh, id euismod est. Nunc ac nulla diam. Aliquam molestie risus mauris, nec malesuada lectus tincidunt sed. Praesent in molestie turpis. Curabitur at quam sit amet mauris ornare egestas. Nam sed ante id augue venenatis elementum in ut diam. Donec blandit ligula id sem consequat, vitae consectetur quam pellentesque.");

        Post post2 = new Post();
        post2.setAutor("Gabriel Sales");
        post2.setData(LocalDate.now());
        post2.setTitulo("API REST");
        post2.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis varius imperdiet mi, a faucibus nibh tristique sed. Duis lectus nisi, congue in nisi eget, fermentum ullamcorper metus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Phasellus hendrerit aliquam tellus, sed pellentesque nisl sodales nec. Suspendisse potenti. Donec in vehicula felis, sed tempor arcu. Donec sit amet vehicula nibh, id euismod est. Nunc ac nulla diam. Aliquam molestie risus mauris, nec malesuada lectus tincidunt sed. Praesent in molestie turpis. Curabitur at quam sit amet mauris ornare egestas. Nam sed ante id augue venenatis elementum in ut diam. Donec blandit ligula id sem consequat, vitae consectetur quam pellentesque.");

        postList.add(post1);
        postList.add(post2);

        for(Post post: postList){
            Post postSaved = springBlogRepository.save(post);
            System.out.println(postSaved.getId());
        }

    }
}
