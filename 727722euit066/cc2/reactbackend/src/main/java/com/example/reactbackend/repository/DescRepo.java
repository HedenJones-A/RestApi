package com.example.reactbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reactbackend.model.DescModel;
@Repository
public interface DescRepo extends JpaRepository<DescModel,Long> {

    
}

