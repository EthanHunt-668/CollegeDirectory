package io.leucine.CollegeDirectory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class AdministratorProfile {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer admin_id;
	
	private Integer user_id;
	private String photo;
	private Integer department_id;
}
