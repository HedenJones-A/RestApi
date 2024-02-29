package com.example.reactbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.reactbackend.model.Admin;
import com.example.reactbackend.model.Post;

public interface PostRepo extends JpaRepository<Post,Long> {
    @Query("select u from Admin u where u.username=?1")
    List<Admin> findbyuser(String username,String password);
}