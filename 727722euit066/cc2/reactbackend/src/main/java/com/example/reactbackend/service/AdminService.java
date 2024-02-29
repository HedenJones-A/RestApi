package com.example.reactbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reactbackend.model.Admin;
import com.example.reactbackend.repository.AdminRepo;

@Service
public class AdminService {
    @Autowired
    AdminRepo adminRepo;
    
    public Admin add(Admin det){
        return adminRepo.save(det);
    }

}
