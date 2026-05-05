package com.pluralsight;

public class Employee {

    private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String firstName, String lastName, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {

        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {

        double regularHours = getRegularHours();
        double overtimeHours = getOvertimeHours();

        double regularPay = regularHours * payRate;

        double overtimePay = overtimeHours * (payRate * 1.5);

        return regularPay + overtimePay;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getRegularHours() {

        if (hoursWorked <= 40) {
            return hoursWorked;
        }
        return 40;
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }
        return 0;
    }
}
