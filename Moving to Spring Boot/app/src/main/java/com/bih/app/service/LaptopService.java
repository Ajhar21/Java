package com.bih.app.service;

import com.bih.app.model.Laptop;
import com.bih.app.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap){
        repo.save(lap);
//        System.out.println("Method called");
    }
}
