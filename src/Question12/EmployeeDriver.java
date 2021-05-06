/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Jaya Kumar Saga
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 12: Jaya Kumar Saga");
        ArrayList<Employee> E = new ArrayList<>();
        Employee e1 = new Employee(324, "Ronny", 34243);
        Employee e2 = new Employee(435, "Eddie", 54342);
        Employee e3 = new Employee(123, "Hall", 1231);
        Employee e4 = new Employee(832, "Braun", 238233);
        Employee e5 = new Employee(233, "Shaw", 122);
        
        E.add(e1);
        E.add(e2);
        E.add(e3);
        E.add(e4);
        E.add(e5);
        
        //printing the original order
        System.out.println("printing the original order");
        printEmployee(E);
        Collections.sort(E);
        System.out.println("sorted list based on id");
        printEmployee(E);
        System.out.println("sorting based on salary");
        Collections.sort(E, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int compareTo = Double.compare(e1.getEmpSalary(), e2.getEmpSalary());
               if (Double.compare(e1.getEmpSalary(), e2.getEmpSalary()) == 0) {
	   return Double.compare(e1.getEmpSalary(), e2.getEmpSalary());
            } else {
              return Double.compare(e1.getEmpSalary(), e2.getEmpSalary());
            } 
            } 
        });
        printEmployee(E);
        System.out.println("sorting based on employee name");
        Collections.sort(E, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int compareTo = e1.getEmpName().compareTo(e2.getEmpName());
               if (e1.getEmpName().compareTo(e2.getEmpName()) == 0) {
	   return e1.getEmpName().compareTo(e2.getEmpName());
            } else {
              return e1.getEmpName().compareTo(e2.getEmpName());
            } 
            } 
        });
        printEmployee(E);

    }
    
    private static void printEmployee(List<Employee> empList){
        for(Employee em: empList){
            System.out.println(em.toString());
        }
    }
}
