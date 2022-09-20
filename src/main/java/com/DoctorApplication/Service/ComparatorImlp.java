package com.DoctorApplication.Service;

import java.util.Comparator;

import com.DoctorApplication.Entity.DoctorData;


public class ComparatorImlp implements Comparator<DoctorData> {

	@Override
	public int compare(DoctorData o1, DoctorData o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()==o2.getSalary()) {
			return o1.getName().compareToIgnoreCase(o2.getName());
	} else if(o2.getSalary()>o1.getSalary()) {
		return 1;					
	}
	else {
		return -1;
	}
  }
}

