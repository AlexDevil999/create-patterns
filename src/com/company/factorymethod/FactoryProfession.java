package com.company.factorymethod;

public class FactoryProfession {

    public Employee getEmployee(int level) {

        switch (level) {
            case 1:
                return new Admin();
            case 2:
                return new Analytic();
            case 3:
                return new Programmer();
        }
        return null;
    }

}
