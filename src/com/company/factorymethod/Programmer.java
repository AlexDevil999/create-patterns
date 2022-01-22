package com.company.factorymethod;

public class Programmer implements Employee{

    @Override
    public Profession getProfession() {
        return Profession.PROGRAMMER;
    }
}
