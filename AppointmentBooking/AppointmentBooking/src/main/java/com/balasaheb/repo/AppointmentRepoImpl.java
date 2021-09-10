package com.balasaheb.repo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.balasaheb.model.AppointmentModel;



@Repository
public class AppointmentRepoImpl implements AppointmentRepo {
@Autowired
JdbcTemplate temp;

@Override
public boolean isAddAppointment(AppointmentModel model,String filename) {
	int value=temp.update("insert into app values('0',?,?,?,?,?,?,?,?,?)", new PreparedStatementSetter(){

		@Override
		public void setValues(PreparedStatement ps) throws SQLException {
			
			ps.setString(1,model.getName());
			ps.setInt(2,model.getAge());
			ps.setString(3,model.getDob());
			ps.setString(4,model.getBlood());
			ps.setString(5,model.getAddress());
			ps.setString(6,model.getMobile());
			ps.setString(7,model.getEmail());
			ps.setString(8,model.getDoa());
			MultipartFile AFile=model.getAfile();
		
			ps.setString(9,AFile.getOriginalFilename());
			
		}


	});
	if(value>0)		
		return true;
	else
		return false;
}
}
