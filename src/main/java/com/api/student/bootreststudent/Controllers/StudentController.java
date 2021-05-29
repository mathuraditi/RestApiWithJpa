package com.api.student.bootreststudent.Controllers;

import java.util.List;

import com.api.student.bootreststudent.Services.StudentServices;
import com.api.student.bootreststudent.entities.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
    @Autowired
    private StudentServices studentService;


    //get all students handler
   @GetMapping("/students")
     public List<Students> getStudents()
     {
         
         return this.studentService.getAllStudents();
     }


     //get single student handler
     @GetMapping("/students/{id}")
     public Students getStudent(@PathVariable("id") int id)
     {
          return studentService.getStudentById(id);
     }


     //add new student handler
     @PostMapping("/students")
     public Students addStudent(@RequestBody Students stud)
     {
        Students st = this.studentService.addStudent(stud);
        System.out.println(stud);
         return st;
     }

     //delete student handler
     @DeleteMapping("/students/{studentId}")
     public void deleteStudent(@PathVariable("studentId") int studentId)
     {
          this.studentService.deleteStudent(studentId);
     }

     //update student handler
     @PutMapping("/students/{studentId}")
     public void updateStudent(@RequestBody Students student,@PathVariable("studentId") int studentId)
     {
          this.studentService.updateStudent(student,studentId);  
     }
    
}
