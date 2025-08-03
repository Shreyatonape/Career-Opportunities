package com.ssc.career.service;

import com.ssc.career.entity.CareerOpportunity;
import com.ssc.career.repository.CareerOpportunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CareerService {

    @Autowired
    private CareerOpportunityRepository repository;

    public List<CareerOpportunity> getAllOpportunities() {
        return repository.findAll();
    }

    public CareerOpportunity addOpportunity(CareerOpportunity opportunity) {
        return repository.save(opportunity);
    }

    public void deleteOpportunity(Long id) {
        repository.deleteById(id);
    }

    public CareerOpportunity getOpportunityById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
