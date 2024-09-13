package io.leucine.CollegeDirectory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class StudentProfile {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer student_id;
	
	private Integer user_id;
	private String photo;
	private Integer department_id;
	private String year;
	private String attendance;
	private Integer course_id;
}
