package com.example.java;

public class Main {

    //a main class to create instances of the employee class
    public static void main(String[] args) {

        //information to create 3 instances, one for each employee, passing their relevant information to the constructor
        Employee person1 = new Employee("James Dean", 101, 3);
        Employee person2 = new Employee("Jimmy Hendrix", 102, 2);
        Employee person3 = new Employee("Jim Belushi", 103, 1);

        //call the object name to run the displayinformation method in employee class to display the employees information
        person1.displayInformation();
        person2.displayInformation();
        person3.displayInformation();
    }
}