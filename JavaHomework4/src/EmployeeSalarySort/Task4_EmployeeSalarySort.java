package EmployeeSalarySort;

import java.util.Scanner;

public class Task4_EmployeeSalarySort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String position = sc.nextLine();
        String department = sc.nextLine();
        double salary = sc.nextInt();
        Employee person = new Employee(name, salary, position, department);
        
        person.print();
    }
    
}