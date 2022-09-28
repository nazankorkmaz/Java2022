/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args)
    {
     Customer c=new Customer();
     Employee e= new Employee();
     
     
     
     EmployeeManager employeeManager=new EmployeeManager();
     CustomerManager customerManager=new CustomerManager();
     employeeManager.BestEmployee();
    }
     
}
