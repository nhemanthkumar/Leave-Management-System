package com.lms.leavemanagementsystem.repository;

import com.lms.leavemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {


    Optional<Employee> findByEmployeeId(Long employeeId);
}
