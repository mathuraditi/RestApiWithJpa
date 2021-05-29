package com.api.student.bootreststudent.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="students")
public class Students 
{
    
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "student_id")
     private int studentId;

      private String studentName;
      private String studentMailId;

      public Students(int studentId, String studentName, String studentMailId)
       {
           super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMailId = studentMailId;
    }

    public Students() 
    {

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentMailId() {
        return studentMailId;
    }

    public void setStudentMailId(String studentMailId) {
        this.studentMailId = studentMailId;
    }

    @Override
    public String toString() {
        return "Students [studentId=" + studentId + ", studentName=" + studentName + ", studentMailId=" + studentMailId
                + "]";
    }

}
