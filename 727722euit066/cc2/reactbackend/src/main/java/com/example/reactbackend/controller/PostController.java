package com.example.reactbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reactbackend.model.Admin;
import com.example.reactbackend.model.Post;
import com.example.reactbackend.service.PostService;

@RestController
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping("/post/{username}/{password}")
    public List<Admin> add(@PathVariable String username,@PathVariable String password){
       return postService.add(username,password);
    }
}
