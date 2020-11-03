package com.org.man.controller;

import com.org.man.model.Man;
import com.org.man.repository.ManRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ManContro {
    @Autowired
    ManRepo manRepo;
    @PostMapping("create")
    public void create(@RequestBody Man man){
        manRepo.save(man);
    }
    @GetMapping("getAll")
    public List<Man> getAll(){
        return manRepo.findAll();
    }
    @GetMapping("getId/{manId}")
    public Man getId(@PathVariable Integer manId){
        return  manRepo.findByManId(manId);
    }
    @GetMapping("getAge/{manAge}")
    public Man getAge(@PathVariable Integer manAge){
        return manRepo.findByManAge(manAge);
    }
    @GetMapping("getAddress/{manAddress}")
    public Man getAddress(@PathVariable String manAddress)
    {
        return  manRepo.findByManAddress(manAddress);
    }
    @GetMapping("getInterest/{manInterest}")
    public Man getInterest(@PathVariable String manInterest){
        return manRepo.findByManInterest(manInterest);
    }
    @DeleteMapping("delete/{manId}")
    public void delete(@PathVariable Integer manId){
        manRepo.deleteByManId(manId);
    }
}
