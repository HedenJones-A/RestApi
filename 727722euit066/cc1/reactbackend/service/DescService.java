package com.example.reactbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.reactbackend.model.DescModel;
import com.example.reactbackend.model.TravelModel;
import com.example.reactbackend.repository.DescRepo;

@Service
public class DescService {
    @Autowired 
    DescRepo descRepo;
    public DescModel add(DescModel det){
        return descRepo.save(det);
    }
    public List<DescModel> get(){
        return descRepo.findAll();
    }
    public String delete(Long id){
        descRepo.deleteById(id);
        return "Deleted successfully";
    }
    public DescModel edit(@PathVariable Long id,DescModel det){
        DescModel data=descRepo.findById(id).orElse(null);
        if(data!=null){
            data.setDesc(det.getDesc());
            data.setStartdate(det.getStartdate());
            data.setEnddate(det.getEnddate());
            data.setPrice(det.getPrice());
            return descRepo.saveAndFlush(data);
        }
        return(data);
    }


}
