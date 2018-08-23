package com.example.demo.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
@RepositoryRestResource
public interface StudentRepository extends CrudRepository<Student, Integer> {

}