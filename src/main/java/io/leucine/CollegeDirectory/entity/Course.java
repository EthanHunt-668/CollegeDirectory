package io.leucine.CollegeDirectory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer course_id;
	
	private String title;
	private Integer department_id;
	private Integer faculty_id;
	private String description;
}
