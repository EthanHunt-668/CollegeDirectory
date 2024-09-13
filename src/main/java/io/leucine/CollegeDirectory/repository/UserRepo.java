package io.leucine.CollegeDirectory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.leucine.CollegeDirectory.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
	User findByEmailAndPassword(String email,String password);
}
