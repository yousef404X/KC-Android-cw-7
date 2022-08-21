package com.example.insta;

public class Student {

 String studentName;
 int price;
 double studentAge;
 int studnetimg;

    public Student(String studentName, double studentAge, int studentGrade, int studnetimg) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studnetimg = studnetimg;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }


    public int getStudnetimg() {
        return studnetimg;
    }

    public void setStudnetimg(int studnetimg) {
        this.studnetimg = studnetimg;
    }
}
