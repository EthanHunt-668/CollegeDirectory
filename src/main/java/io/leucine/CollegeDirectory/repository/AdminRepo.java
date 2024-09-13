package io.leucine.CollegeDirectory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.leucine.CollegeDirectory.entity.AdministratorProfile;

@Repository
public interface AdminRepo extends JpaRepository<AdministratorProfile, Integer> {

}
