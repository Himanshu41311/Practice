package com.example.demo.controller;

import com.example.demo.model.CARS;
import com.example.demo.repository.carrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class carcontrooler {
    @Autowired
    carrepo cr;


    @GetMapping("/see")
    public List<CARS> getCars(){
        System.out.println("hi");
        return cr.findAll();
    }

    @PostMapping("/add")
        public String addCar(@RequestBody CARS car){
            cr.save(car);
            return "Added successfully";

    }



}
