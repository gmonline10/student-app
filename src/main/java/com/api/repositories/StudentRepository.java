package com.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.api.models.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Long> {

}
