package com.lhajdun;

public class Main {

    public static void main(String[] args) {

        Employee lucasHajdun = new Employee("Lucas", "Hajdun", 1234);
        Employee annThompson = new Employee("Ann", "Thompson", 1453);
        Employee denisMorgan = new Employee("Denis", "Morgan", 1563);
        Employee janeJackson = new Employee("Jane", "Jackson", 1425);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(lucasHajdun);
        list.addToFront(annThompson);
        list.addToFront(denisMorgan);
        list.addToFront(janeJackson);

        System.out.println("Employee list size = " + list.getSize());
        list.printList();

        list.removeFromFront();
        System.out.println("Employee list size = " + list.getSize());
        list.printList();



    }
}
