package com.lhajdun;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        // Vector is synchronized (it's slower than ArrayList so if you don't need thread safety, use ArrayList)
        List<Employee> employeeList = new Vector<>();

        employeeList.add(new Employee("Lucas", "Hajdun", 1234));
        employeeList.add(new Employee("Ann", "Thompson", 1453));
        employeeList.add(new Employee("Denis", "Morgan", 1563));
        employeeList.add(new Employee("Jane", "Jackson", 1425));

        System.out.println(employeeList);

    }
}
