package com.company;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private ArrayList<Student> myStudents;

    public Teacher(String name) {
        this.name = name;
        this.myStudents = new ArrayList<Student>();
    }

    public boolean addNewStudent(Student student) {
        if(findStudent(student.getName()) >= 0) {
            System.out.println("Student is already joined");
            return false;
        }

        myStudents.add(student);
        return true;

    }

    public boolean updateStudent(Student oldStudent, Student newStudent) {
        int foundPosition = findStudent(oldStudent);
        if(foundPosition <0) {
            System.out.println(oldStudent.getName() +", was not found.");
            return false;
        }

        this.myStudents.set(foundPosition, newStudent);
        System.out.println(oldStudent.getName() + ", was replaced with " + newStudent.getName());
        return true;
    }

    public boolean removeStudent(Student student) {
        int foundPosition = findStudent(student);
        if(foundPosition <0) {
            System.out.println(student.getName() +", was not found.");
            return false;
        }
        this.myStudents.remove(foundPosition);
        System.out.println(student.getName() + ", was deleted.");
        return true;
    }

    private int findStudent(Student student) {
        return this.myStudents.indexOf(student);
    }

    private int findStudent(String studentName) {
        for(int i=0; i<this.myStudents.size(); i++) {
            Student student = this.myStudents.get(i);
            if(student.getName().equals(studentName)) {
                return i;
            }
        }
        return -1;
    }



    private int findPassword(Student password) {
        return this.myStudents.indexOf(password);
    }
    private int findPassword(String password) {
        for(int i=0; i<this.myStudents.size(); i++) {
            Student password1 = this.myStudents.get(i);
            if(password1.getPassword().equals(password)) {
                return i;
            }
        }
        return 0;
    }
    public String queryPassword(Student password) {
        if(findPassword(password) >=0) {
            return password.getPassword();
        }
        return null;
    }
    public Student queryPassword(String password) {
        int password1 = findPassword(password);
        if(password1 >= 0) {
            return this.myStudents.get(password1);
        }
        return null;
    }



    public String queryStudent(Student student) {
        if(findStudent(student) >=0) {
            return student.getName();
        }
        return null;
    }

    public Student queryStudent(String name) {
        int position = findStudent(name);
        if(position >=0) {
            return this.myStudents.get(position);
        }
        return null;
    }

    public void printStudents() {
        System.out.println("Student List");
        for(int i=0; i<this.myStudents.size(); i++) {
            System.out.println((i+1) + "." +
                    this.myStudents.get(i).getName() + " -> " +
                    this.myStudents.get(i).getId());
        }
    }

    public void printSubjects() {
        System.out.println("Sanskrit = 99\n" +
                            "English = 97\n" +
                            "Maths  = 150\n" +
                            "Physics = 54\n" +
                            "Chemistry = 34\n" +
                "Your total marks : 434 / 470\n" +
                "Grade : A+");
    }
}

