package com.example.reactbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reactbackend.model.Admin;
@Repository
public interface AdminRepo extends JpaRepository<Admin,Long> {
    
}
