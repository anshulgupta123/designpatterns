package com.anaplan.dryprinciplesdesignpatterns.main;

import com.anaplan.dryprinciplesdesignpatterns.modal.Employee;
import com.anaplan.dryprinciplesdesignpatterns.utility.Utility;

import java.util.ArrayList;
import java.util.List;

public class EmployeeApp {
    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<>();
        Employee employee= new Employee();
        employee.setEid(1l);
        employee.setName("Anshul");
        employee.setRegistredTime(Utility.getCurrenetTimestamp());
        employeeList.add(employee);
        Employee employee1= new Employee();
        employee1.setEid(2l);
        employee1.setName("Aman");
        employee1.setRegistredTime(Utility.getCurrenetTimestamp());
        employeeList.add(employee1);
        employeeList.stream().forEach(System.out::println);
    }
}
