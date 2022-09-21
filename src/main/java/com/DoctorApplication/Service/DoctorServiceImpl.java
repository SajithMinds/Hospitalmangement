package com.DoctorApplication.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.DoctorApplication.Entity.DoctorData;
import com.DoctorApplication.Exception.ResourceNotFoundException;
import com.DoctorApplication.Repository.DoctorRepository;

@Component
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorRepository repos;
	
		public DoctorData  saveDoctordetails(DoctorData details) {
			// TODO Auto-generated method stub
			if(!repos.existsById(details.getId())) {
				return repos.save(details);
			} else {
				throw new ResourceNotFoundException("Id Already exist in the database");
			}
		}

		public List<DoctorData> getAllDoctorData() {
			// TODO Auto-generated method stub
			List<DoctorData> doctorsdetails= (List<DoctorData>) repos.findAll();
			Comparator<DoctorData> comp=new ComparatorImlp();
			Collections.sort(doctorsdetails ,comp);
			return doctorsdetails;
		}

		public DoctorData getDetailsById(int id) {
			// TODO Auto-generated method stub
			return repos.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id doesn't exist in the database" + id));
		}
		
		public DoctorData UpdateDoctorDetails(int id,double salary) throws ResourceNotFoundException {
			// TODO Auto-generated method stub
		
				DoctorData doctorsdetails=this.repos.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id doesn't exist in the database" + id));
				
			    doctorsdetails.setSalary(salary);
			    repos.save(doctorsdetails);
			    
				return doctorsdetails;
				
		
		}
		
		public void deleteDoctorDetails(int id) {
			repos.deleteById(id);
		}	
}

