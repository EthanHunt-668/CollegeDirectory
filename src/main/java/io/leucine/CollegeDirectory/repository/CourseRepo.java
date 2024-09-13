package io.leucine.CollegeDirectory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.leucine.CollegeDirectory.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {
	Course findByCourse_id(Integer course_id);
}
