package com.example.reactbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.reactbackend.model.DescModel;
import com.example.reactbackend.service.DescService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class DescController {
    @Autowired
    DescService descService;
    @GetMapping("/desc/get")
    public List<DescModel> getMethodName() {
        return descService.get();
    }
    @PostMapping("/desc/add")
    public DescModel postMethodName(@RequestBody DescModel det) {
        
        return descService.add(det);
    }
    @DeleteMapping("/desc/del/{id}")
    public String Deletementhod(@PathVariable Long id){
        return descService.delete(id);
        

    }
    @PutMapping("/desc/edit/{id}")
    public DescModel edit(@PathVariable Long id,@RequestBody DescModel det){
        return (descService.edit(id, det));
    }
    
    
    
    
}
