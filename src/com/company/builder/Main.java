package com.company.builder;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee.Builder()
                .setLevel(3)
                .setName("Alex")
                .setProfession("Programmer")
                .build();

        System.out.println(employee.toString());

    }
}
