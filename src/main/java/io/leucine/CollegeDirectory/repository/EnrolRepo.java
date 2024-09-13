package io.leucine.CollegeDirectory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.leucine.CollegeDirectory.entity.Enrollment;

@Repository
public interface EnrolRepo extends JpaRepository<Enrollment, Integer> {

}
