package com.company.factorymethod;

public class Main {

    public static void main(String[] args) {

        FactoryProfession fp = new FactoryProfession();
        Employee e = fp.getEmployee(3);
        System.out.println(e.getProfession());

    }
}
