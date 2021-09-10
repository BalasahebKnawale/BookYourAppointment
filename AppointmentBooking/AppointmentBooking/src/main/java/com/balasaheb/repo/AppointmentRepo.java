package com.balasaheb.repo;

import com.balasaheb.model.AppointmentModel;

public interface AppointmentRepo {
	public boolean isAddAppointment(AppointmentModel model,String filename);
}
