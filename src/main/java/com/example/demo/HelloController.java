package com.example.demo;

public class HelloController {

    private int StudentId;
    private String StudentName;
    private String StudentDist;

    public void setStudentDist(String StudentDist) {
        this.StudentDist = StudentDist;
    }

    public String getStudentDist() {
        return StudentDist;
    }
    
    public void setStudentId(int StudentId){
        this.StudentId=StudentId;
    }

    public int getStudentId(){
        return StudentId;
    }

    public void setStudentName(String StudentName){
        this.StudentName=StudentName;
    }

    public String getStundetName(){
        return StudentName;
    }

    public void displayinfo(){

        System.out.println(StudentDist);
        System.out.println(StudentId);
        System.out.println(StudentName);
   
    }
}
