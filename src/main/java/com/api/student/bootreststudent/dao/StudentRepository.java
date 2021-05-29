package com.api.student.bootreststudent.dao;

import com.api.student.bootreststudent.entities.Students;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Students,Integer>
 {
    public Students findById(int id);
}
