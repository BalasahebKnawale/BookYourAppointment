package com.balasaheb.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.balasaheb.model.AppointmentModel;
import com.balasaheb.service.AppointmentService;


@RestController
@RequestMapping("/")
public class AdminController {
	
	@Autowired
	AppointmentService service;
	
	@GetMapping("add")
	public ModelAndView Add() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("appointment");
		return mav;
	}

	
	@PostMapping("/save") 
	public ModelAndView savegallery(AppointmentModel mod, HttpServletRequest req) throws IOException{
			ModelAndView mav=new ModelAndView();
		
			String filename=mod.getAfile().getOriginalFilename();
			System.out.println("Filename is="+filename);
			if(filename.isEmpty()==false) {
			int index=filename.indexOf(".pdf");
			
		    String destinationfile="";
		    
		    if(index!=-1 )
		    {
				String realPathtoUploads = req.getServletContext().getRealPath("/");
				
				String folder = realPathtoUploads + "Appointment";

				if (!new File(folder).exists()) {
					new File(folder).mkdir();
				}
				if (mod.getAfile()!= null) 
				{
					destinationfile = folder + "/"+ filename;
					System.out.println("Destination folder "+destinationfile);
					File destfile = new File(destinationfile);
					mod.getAfile().transferTo(destfile);
					  } 
			boolean b = service.isAddAppointment(mod, filename);
			if(b) {
				mav.addObject("msg", "Record Saved Successfully...");
			}
			else {
				mav.addObject("msg", "Record Not Saved...");
			}
		    }
			else
			{
				mav.addObject("msg", "File Is Not Valid");
			}
		}
			
			else {
				boolean b = service.isAddAppointment(mod, filename);
				if(b) {
					mav.addObject("msg", "Record Saved Successfully...");
				}
				else {
					mav.addObject("msg", "Record Not Saved...");
				}
			}
			mav.setViewName("appointment");
			return mav;
			
	}
	
	
}
