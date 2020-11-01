/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myemployeedetails;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Employee {
    String name,designation;
    int age;
    double salary;
    void getDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        name=sc.nextLine();
        System.out.println("Enter age: ");
        age=sc.nextInt();
        System.out.println("Enter salary: ");
        salary=sc.nextDouble();
        System.out.println("Enter designation: ");
        designation=sc.nextLine();
    }
    void displayDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("Designation: "+designation);
    }
}
