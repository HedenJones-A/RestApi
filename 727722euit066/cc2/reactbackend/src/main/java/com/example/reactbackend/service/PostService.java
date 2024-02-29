package com.example.reactbackend.service;

import java.util.List;

// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Service;

import com.example.reactbackend.model.Post;
import com.example.reactbackend.model.Admin;
import com.example.reactbackend.repository.PostRepo;

@Service
public class PostService {
    @Autowired 
    PostRepo postRepo;

    public Admin add(String username,String password,Post det){
       List<Admin> s=postRepo.findbyuser(username,password);
       if(s.size()>0){
        // postRepo.save()
       }
    }

}
