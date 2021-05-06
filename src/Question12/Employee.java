/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

/**
 *
 * @author Jaya Kumar Saga
 */
public class Employee implements Comparable<Employee> {

    private int empId; //employee id
    private String empName; // name of the employee
    private double empSalary;  //employee salary

    //construtor for employee class
    public Employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    //getter method for employee id
    public int getEmpId() {
        return empId;
    }

    //getter method for employee name
    public String getEmpName() {
        return empName;
    }

    //getter method for employee salary
    public double getEmpSalary() {
        return empSalary;
    }

    //method to convert employee object to string
    @Override
    public String toString() {
        return  "empId=" + empId + " empName=" + empName + " empSalary=" + empSalary ;
    }

    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(empId, employee.getEmpId());
    }

}
