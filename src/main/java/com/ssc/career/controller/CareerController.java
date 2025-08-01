package com.ssc.career.controller;

import com.ssc.career.entity.CareerOpportunity;
import com.ssc.career.service.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/careers")
@CrossOrigin(origins = "*")
public class CareerController {

    @Autowired
    private CareerService service;

    @GetMapping
    public List<CareerOpportunity> getAllOpportunities() {
        return service.getAllOpportunities();
    }

    @PostMapping
    public CareerOpportunity addOpportunity(@RequestBody CareerOpportunity opportunity) {
        return service.addOpportunity(opportunity);
    }

    @DeleteMapping("/{id}")
    public void deleteOpportunity(@PathVariable Long id) {
        service.deleteOpportunity(id);
    }

    @GetMapping("/{id}")
    public CareerOpportunity getOpportunityById(@PathVariable Long id) {
        return service.getOpportunityById(id);
    }
}
