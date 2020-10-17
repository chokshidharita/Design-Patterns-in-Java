package com.design.patterns.creational.builder.solution;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

    public EmployeeBuilder worksAs(String designation) {
        person.setWorksAs(designation);
        return self();
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
