package io.leucine.CollegeDirectory.binding;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class FacultySearch {

	private String name;
	private String email;
	private String phone;
	private String course;
}
