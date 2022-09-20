package com.DoctorApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DoctorApplication.Entity.DoctorData;
import com.DoctorApplication.Service.DoctorServiceImpl;

@RestController
@RequestMapping("/Api")
public class DoctorController {
	@Autowired
	private DoctorServiceImpl service;
	
	@PostMapping("/save")
	public DoctorData saveDoctordetails(@RequestBody DoctorData details) {
		return service.saveDoctordetails(details);
		}
	
	@GetMapping("/list")
	public List<DoctorData> getAllDoctorData(){
		return service.getAllDoctorData();
	}

	@GetMapping("/details/{id}")
	public DoctorData getDetailsById(@RequestBody DoctorData details,@PathVariable int id) {
		return service.getDetailsById(details,id);
	}
	
	@PutMapping("/updetails/{salary}")
	public DoctorData UpdateDoctorDetails(@RequestBody DoctorData details,@PathVariable double salary) {
	return service.UpdateDoctorDetails(details, salary);
	}

	@DeleteMapping("/del/{id}")
	public ResponseEntity<String> deleteDoctorDetails(@PathVariable int id) {
	 service.deleteDoctorDetails(id);
	return new ResponseEntity<String>("Doctor id "+ id +" Deleted Successfully",HttpStatus.OK);
	}
}
