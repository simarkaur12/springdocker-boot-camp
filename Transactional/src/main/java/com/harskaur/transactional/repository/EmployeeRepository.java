package com.harskaur.transactional.repository;

import com.harskaur.transactional.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing <code>Employee</code> entities.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}