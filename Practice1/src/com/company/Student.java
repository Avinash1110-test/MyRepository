package com.company;

public class Student {
    private String name;
    private String id;
    private String password;

    public Student(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
//command
    public static Student createStudent(String name, String id, String password) {
        return new Student(name, id, password);
    }
}
