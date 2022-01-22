package com.company.factorymethod;

public class Analytic implements Employee{


    @Override
    public Profession getProfession() {
        return Profession.ANALYTIC;
    }
}
