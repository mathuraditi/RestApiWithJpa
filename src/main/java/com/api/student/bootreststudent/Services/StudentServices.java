package com.api.student.bootreststudent.Services;

import java.util.List;

import com.api.student.bootreststudent.dao.StudentRepository;
import com.api.student.bootreststudent.entities.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServices 
{
    @Autowired
    private StudentRepository studentRepository;

    //private static List<Students> studentList = new ArrayList<>();

    /*static 
    {
        studentList.add(new Students(1,"Aditi Mathur","mathuraditi84@gmail.com"));
        studentList.add(new Students(2,"Priyank Gupta","priyank2021@gmail.com"));
        studentList.add(new Students(3,"John Smith","johnsmith2020@gmail.com"));
    }*/

    //get all Students
    public List<Students> getAllStudents()
    {
        List<Students> studentList = (List<Students>)this.studentRepository.findAll();
        return studentList;
    }

    //get single student by id
    public Students getStudentById(int studentId)
    {
        Students student = null;
        try 
        {
           student = this.studentRepository.findById(studentId);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return student;

    }

    //adding new students
    public Students addStudent(Students stud)
    {
        Students result = studentRepository.save(stud);
        return result;
    }

    //delete student
    public void deleteStudent(int studentId) 
    {
       // studentList = studentList.stream().filter(stud->stud.getStudentId()!=studentId).
       // collect(Collectors.toList());
       studentRepository.deleteById(studentId);

    }

    public void updateStudent(Students student, int studentId) 
    {
        /* studentList.stream().map(stud->{
             if(stud.getStudentId() == studentId)
             {
                 stud.setStudentName(student.getStudentName());
                 stud.setStudentMailId(student.getStudentMailId());
             }
              return stud;
         }).collect(Collectors.toList());*/

         student.setStudentId(studentId);
         studentRepository.save(student);
    }

}
