package com.nickdemos.java;

public class ToString {

    public static void main (String[] args){

        Student s1 = new Student(5, "Jackson");
        System.out.println(s1);
    }
}

class Student{
    int rollno;
    String sname;

    public Student(int rollno, String sname){
        this.rollno = rollno;
        this.sname = sname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("rollno=").append(rollno);
        sb.append(", sname='").append(sname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
