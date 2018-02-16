package com.example.java;

public class Employee {

    //create class variables to hold the information for each employee
    private String name;
    private int employeeNumber;
    private int shift;

    //constructor method that will initialise the variables
    public Employee(String name, int employeeNumber, int shift) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.shift = shift;
    }

    //getter and setter methods to get and set the values for the different variables after they have been constructed
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    //a method that will display the variables for a given object in a nicely formatted way
    public void displayInformation() {
        System.out.println("Name: " + name + "\nEmployeeID: " + employeeNumber + "\nShift Number: " + shift + "\n");
    }
}
