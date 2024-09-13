package io.leucine.CollegeDirectory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.leucine.CollegeDirectory.entity.FacultyProfile;

@Repository
public interface FacultyRepo extends JpaRepository<FacultyProfile, Integer> {

}
