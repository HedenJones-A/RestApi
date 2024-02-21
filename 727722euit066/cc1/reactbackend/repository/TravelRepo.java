package com.example.reactbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reactbackend.model.TravelModel;
@Repository
public interface TravelRepo extends JpaRepository<TravelModel,Long> {
   List<TravelModel> findByUsername(String userName); 
   List<TravelModel> findByEmail(String email);
   List<TravelModel> findByPassword(String password); 
}
