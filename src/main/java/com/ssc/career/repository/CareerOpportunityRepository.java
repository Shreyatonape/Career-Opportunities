package com.ssc.career.repository;

import com.ssc.career.entity.CareerOpportunity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CareerOpportunityRepository extends JpaRepository<CareerOpportunity, Long> {
}
