package com.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.models.Student;

@RestController
public class RegistrationController {
	
	   @GetMapping("/getOTP")
	   public ResponseEntity<String> sendOTP(@RequestBody String mobile)
	   {
		   return ResponseEntity.ok("OTP has been sent to your mobile number");
	   }
	   
	   
	   
	   @PostMapping("/register")
	   public ResponseEntity<String> addStudent(@RequestBody Student student)
	   {
		   return ResponseEntity.ok("Your registration is done!");
	   }
}
