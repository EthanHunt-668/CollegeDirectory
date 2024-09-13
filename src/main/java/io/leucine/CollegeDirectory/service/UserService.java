package io.leucine.CollegeDirectory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.leucine.CollegeDirectory.binding.*;
import io.leucine.CollegeDirectory.entity.*;
import io.leucine.CollegeDirectory.repository.*;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private StudentRepo stuRepo;
	@Autowired
	private FacultyRepo facultyRepo;
	@Autowired
	private AdminRepo adminRepo;
	@Autowired
	private CourseRepo cRepo;
	
	public DashboardObject login(User u) {
		User obj = userRepo.findByEmailAndPassword(u.getEmail(), u.getPassword());
		if(obj.getRole()=="Student") {
			
			StudentProfile obj1= stuRepo.findByUser_id(obj.getUser_id());
			Course obj2=cRepo.findByCourse_id(obj1.getCourse_id());
			
			DashboardObject studentInfo= new DashboardObject();
			
			studentInfo.setName(obj.getName());
			studentInfo.setEmail(obj.getEmail());
			studentInfo.setPhone(obj.getPhone());
			studentInfo.setPhoto(obj1.getPhoto());
			studentInfo.setAttendance(obj1.getAttendance());
			studentInfo.setCourses(obj2.getTitle());
			
			return studentInfo;
		}
		return null;
	}
	
//	public SearchObject searchStudent(Student stu) {
//		
//		return null;
//	}
//	
//	public FacultyObject getFacultyDetails(Integer i) {
//		
//		return null;
//	}

}
