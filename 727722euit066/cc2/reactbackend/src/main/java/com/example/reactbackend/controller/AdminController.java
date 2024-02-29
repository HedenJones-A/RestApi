package com.example.reactbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.reactbackend.model.Admin;
import com.example.reactbackend.service.AdminService;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AdminController {
    @Autowired
    AdminService adminService;
    
    @PostMapping("/admin/add")
    public Admin add(@RequestBody Admin det) {
        return adminService.add(det);
    }
    
    
}
