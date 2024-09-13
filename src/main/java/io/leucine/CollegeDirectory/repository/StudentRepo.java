package io.leucine.CollegeDirectory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.leucine.CollegeDirectory.entity.StudentProfile;

@Repository
public interface StudentRepo extends JpaRepository<StudentProfile, Integer> {
	StudentProfile findByUser_id(Integer user_id);
}
