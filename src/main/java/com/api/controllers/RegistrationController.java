package com.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.models.Student;
import com.api.services.StudentService;

@RestController
@CrossOrigin("*")
public class RegistrationController {
	
	    //IOC
	     @Autowired
	     private StudentService studentService;
	
	   @GetMapping("/getOTP")
	   public ResponseEntity<String> sendOTP(@RequestBody String mobile)
	   {
		   return ResponseEntity.ok("OTP has been sent to your mobile number");
	   }
	   
	   
	   
	   @PostMapping("/register")
	   public ResponseEntity<String> addStudent(@RequestBody Student student)
	   {
		    Student student2 = this.studentService.addStudent(student);
		   if(student2 == null)
		   {
			   return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();   
		   }
		   else {
		   return ResponseEntity.ok("Your registration is done!");
		   }
	   }
}
