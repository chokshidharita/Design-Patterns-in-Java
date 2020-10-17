package com.design.patterns.creational.builder.problem;

public class EmployeeBuilder extends  PersonBuilder{

    public EmployeeBuilder worksAs(String designation) {
        person.setWorksAs(designation);
        return this;
    }

}
