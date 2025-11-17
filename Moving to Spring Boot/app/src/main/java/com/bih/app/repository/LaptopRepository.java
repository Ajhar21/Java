package com.bih.app.repository;

import com.bih.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Laptop object saved");
    }
}
