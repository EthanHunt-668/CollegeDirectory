package io.leucine.CollegeDirectory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.leucine.CollegeDirectory.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
