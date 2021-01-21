package com.lhajdun;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Lucas", "Hajdun", 1234));
        employeeList.add(new Employee("Ann", "Thompson", 1453));
        employeeList.add(new Employee("Denis", "Morgan", 1563));
        employeeList.add(new Employee("Jane", "Jackson", 1425));

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println();

//        employeeList.forEach(employee -> System.out.println(employee));
//        employeeList.forEach(System.out::println);

        employeeList.set(1, new Employee("Steve", "Adams", 4567));

        employeeList.forEach(System.out::println);
        System.out.println("employeeList.size() = " + employeeList.size());
        System.out.println();


        Employee timJones = new Employee("Tim", "Jones", 1200);
        employeeList.add(3, timJones);

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println();

        // Employee List
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employeeArray) {
            System.out.println(employee);
        }
        System.out.println();

        // This will return FALSE if we don't implement equals method in employee class.
        // Default equals method checks if they're the exact same instance.
        System.out.println(employeeList.contains(new Employee("Lucas", "Hajdun", 1234)));
        System.out.println(employeeList.indexOf(timJones));
        System.out.println();

        employeeList.remove(2);
        employeeList.forEach(System.out::println);

    }
}
