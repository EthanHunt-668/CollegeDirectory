package io.leucine.CollegeDirectory.binding;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class StudentSearch {
	
	private String name;
	private String department;
	private String year;
	private String photo;
	private String email;

}
