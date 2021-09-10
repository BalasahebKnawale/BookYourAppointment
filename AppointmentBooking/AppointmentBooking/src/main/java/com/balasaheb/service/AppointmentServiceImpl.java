package com.balasaheb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balasaheb.model.AppointmentModel;
import com.balasaheb.repo.AppointmentRepo;

@Service
public class AppointmentServiceImpl implements AppointmentService{

	@Autowired
	AppointmentRepo repo;
	
	@Override
	public boolean isAddAppointment(AppointmentModel model, String filename) {
		// TODO Auto-generated method stub
		return repo.isAddAppointment(model, filename);
	}

}
