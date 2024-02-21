package com.example.reactbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reactbackend.model.TravelModel;
import com.example.reactbackend.repository.TravelRepo;

// import ch.qos.logback.core.model.Model;

@Service
public class TravelService {
    @Autowired
    TravelRepo travelRepo;

    // public TravelModel ins(TravelModel p){

    //     return travelRepo.save(p);
    // }
   
    public String getdet(TravelModel det){
        List<TravelModel> finddata1= travelRepo.findByUsername(det.getUsername());
        List<TravelModel> finddata2= travelRepo.findByEmail(det.getEmail());

        if((finddata1.size())==0){
            if(finddata2.size()==0){
                travelRepo.save(det);
                return ("Added successfully");
            }
            // return ("Added successfully");
            return ("Already exist");
        }
        return ("Already exist");
        

    }

    public TravelModel edit(Long id,TravelModel det){
        TravelModel data=travelRepo.findById(id).orElse(null);
        if(data!=null){
            data.setUsername(det.getUsername());
            data.setEmail(det.getEmail());
            data.setPhone(det.getPhone());
            data.setPassword(det.getPassword());
            return travelRepo.saveAndFlush(data);
        }

        return null;
    }
    public String delete(Long id){
        travelRepo.deleteById(id);
        return ("Deleted successfully");
    }
    public String login(TravelModel logdet){
        List<TravelModel> username= travelRepo.findByUsername(logdet.getUsername());
        List<TravelModel> password= travelRepo.findByPassword(logdet.getPassword());
        if(username.size()>0){
            if(password.size()>0){
                return ("Logged Successfully");
            }
            return ("Invalid username/password");
        }
        return ("Invalid username/password");

    }


}
