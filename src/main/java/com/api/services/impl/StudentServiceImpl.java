package com.api.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.models.Student;
import com.api.repositories.StudentRepository;
import com.api.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	
	  @Autowired
	  private StudentRepository studentRepository;
	@Override
	public void addStudent(Student student) {
		  try {
	        this.studentRepository.save(student);
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	        
	        
	}

}
