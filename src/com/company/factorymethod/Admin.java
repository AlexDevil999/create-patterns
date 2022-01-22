package com.company.factorymethod;

public class Admin implements Employee{


    @Override
    public Profession getProfession() {
        return Profession.ADMINISTRATOR;
    }
}
