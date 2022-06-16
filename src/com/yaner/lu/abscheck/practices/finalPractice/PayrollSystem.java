package com.yaner.lu.abscheck.practices.finalPractice;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employeeArray = createEmployeeArray();
        int currentMonth = getCurrentMonth();
        for (Employee employee : employeeArray) {
            System.out.println(employee);
            // TODO: Why this result is ignored?
            // employee.toString();
            if (currentMonth == employee.getBirthday().getMonth()) {
                System.out.println("The salary of this month of employee, " + employee.getName() + ", is " + (employee.earnings() + 100) + " yuan.");
            } else System.out.println("The salary of this month of employee, " + employee.getName() + ", is " + employee.earnings() + " yuan.");
        }
    }

    private static Employee[] createEmployeeArray() {
        Employee[] employeeArray = new Employee[3];
        employeeArray[0] = new SalariedEmployee("John", 700, new MyDate(8, 21, 1993), 3200D);
        employeeArray[1] = new HourlyEmployee("Hank", 102, new MyDate(2, 3, 2000), 18.5, 125.5);
        employeeArray[2] = new HourlyEmployee("Gina", 106, new MyDate(6, 16, 1999), 21D, 110.5);
        return employeeArray;
    }

    private static int getCurrentMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Current month is: ");
        return scanner.nextInt();
    }
}
