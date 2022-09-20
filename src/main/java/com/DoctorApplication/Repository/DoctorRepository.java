package com.DoctorApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DoctorApplication.Entity.DoctorData;

public interface DoctorRepository extends JpaRepository<DoctorData, Integer>{

	DoctorData findByName(String name);

	DoctorData findBysalary(double salary);
}

