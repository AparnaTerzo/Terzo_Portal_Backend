package com.example.demo.repository;

import com.example.demo.models.Leaves;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveRepository extends JpaRepository<Leaves,Integer> {
    Leaves findById(int id);
}