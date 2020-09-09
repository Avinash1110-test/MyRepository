package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Teacher teacher = new Teacher("Avinash");

    public static void main(String[] args) {
        boolean quit = false;
        startStudentlogin();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (7 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nLogging out...");
                    quit = true;
                    break;

                case 1:
                    teacher.printStudents();
                    break;

                case 2:
                    addNewStudent();
                    break;

                case 3:
                    updateStudent();
                    break;

                case 4:
                    removeStudent();
                    break;

                case 5:
                    queryStudent();
                    break;

                case 6:
                    studentlogin();
                    break;

                case 7:
                    printActions();
                    break;
            }

        }

    }

    private static void addNewStudent() {
        System.out.println("Enter new student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter id number: ");
        String id = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        Student newStudent = Student.createStudent(name, id, password);
        if(teacher.addNewStudent(newStudent)) {
            System.out.println("New student added: name = " + name + ", id = "+ id);
        } else {
            System.out.println("Cannot add, " + name + " already in joined list.");
        }
    }

    private static void updateStudent() {
        System.out.println("Enter existing student name: ");
        String name = scanner.nextLine();
        Student existingContactRecord = teacher.queryStudent(name);
        if(existingContactRecord == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter new student name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new id: ");
        String newid = scanner.nextLine();
        System.out.println("Enter your new password:");
        String newpassword = scanner.nextLine();
        Student newStudent = Student.createStudent(newName, newid, newpassword);
        if(teacher.updateStudent(existingContactRecord, newStudent)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeStudent() {
        System.out.println("Enter existing Student name: ");
        String name = scanner.nextLine();
        Student existingStudentRecord = teacher.queryStudent(name);
        if (existingStudentRecord == null) {
            System.out.println("Student not found.");
            return;
        }

        if(teacher.removeStudent(existingStudentRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryStudent() {
        System.out.println("Enter existing Student name: ");
        String name = scanner.nextLine();
        Student existingStudentRecord = teacher.queryStudent(name);
        if (existingStudentRecord == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.println("Name: " + existingStudentRecord.getName() + " and ID is " + existingStudentRecord.getId());
    }

    private static void startStudentlogin() {
        System.out.println("Welcome to Newage school.");
    }

    private static void studentlogin() {
        System.out.println("Enter existing Student name: ");
        String name = scanner.nextLine();
        Student existingStudentRecord = teacher.queryStudent(name);
        if (existingStudentRecord == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.println("Enter your password: ");
        String testpassword = scanner.nextLine();
        Student existingstudentpassword = teacher.queryPassword(testpassword);
        if (existingstudentpassword == null) {
            System.out.println("Entered incorrect password.");
            return;
        }
        System.out.println("Succesfully logged in.\n"+
                            "Your name is " + name );
        teacher.printSubjects();

    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to exit\n" +
                "1  - to print Student list\n" +
                "2  - to add a new Student\n" +
                "3  - to update existing Student\n" +
                "4  - to remove an existing Student\n" +
                "5  - query if an existing Student exists\n" +
                "6  - to login\n"+
                "7  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}

