package com.DoctorApplication.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.DoctorApplication.Entity.DoctorData;

@Component
public interface DoctorService {
	
	public DoctorData saveDoctordetails(DoctorData details); 
	public List<DoctorData> getAllDoctorData();
	public DoctorData getDetailsById(int id);
	public DoctorData UpdateDoctorDetails(int id, double salary);
	public void deleteDoctorDetails(int id);

}
