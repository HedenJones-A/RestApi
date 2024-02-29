package com.example.reactbackend.controller;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.reactbackend.model.TravelModel;
import com.example.reactbackend.service.TravelService;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class TravelController {
    @Autowired
    TravelService travelService;

    // @PostMapping("/add")
    // public TravelModel postMethodName(@RequestBody TravelModel det) {
        
    //     return travelService.ins(det);
        
    // }
    @PostMapping("/add")
    public String postMethodName(@RequestBody TravelModel det){
        return travelService.getdet(det);
    }
    @PutMapping("/edit/{id}")
    public TravelModel putMethodName(@PathVariable Long id, @RequestBody TravelModel det) {
        
        return travelService.edit(id, det); 
       
    }
    @DeleteMapping("/del/{id}")
    public String deletemethod(@PathVariable Long id){
        return travelService.delete(id);
    }
    @PostMapping("/log")
    public String login(@RequestBody TravelModel logdetails){
        return travelService.login(logdetails);
    }
}
