package io.leucine.CollegeDirectory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class FacultyProfile {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer faculty_id;
	
	private Integer user_id;
	private String photo;
	private Integer department_id;
	private String office_hours;
}
