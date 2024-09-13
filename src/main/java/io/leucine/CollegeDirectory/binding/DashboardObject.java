package io.leucine.CollegeDirectory.binding;

import java.lang.reflect.Array;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DashboardObject {

	private String name;
	private String email;
	private String phone;
	private String photo;
	private String[] courses;
	private Integer[] grades;
	private String attendance;
	public void setCourses(String title) {
		this.courses[0]= title;
		// TODO Auto-generated method stub
		
	}
}
