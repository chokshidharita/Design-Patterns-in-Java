package com.design.patterns.creational.builder.facede;

public class PersonJobBuilder extends PersonBuilder {

    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder at(String companyName) {
        person.setCompanyName(companyName);
        return this;
    }

    public PersonJobBuilder asA(String designation) {
        person.setPosition(designation);
        return this;
    }

    public PersonJobBuilder earning(int income) {
        person.setAnnualIncome(income);
        return this;
    }
}
