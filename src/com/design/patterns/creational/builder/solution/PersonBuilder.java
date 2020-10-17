package com.design.patterns.creational.builder.solution;

import com.design.patterns.creational.builder.problem.Person;

public class PersonBuilder<T extends PersonBuilder<T>> {

    protected Person person = new Person();

    public T withName(String name) {
        person.setName(name);
        return self();
    }

    public Person build() {
        return person;
    }

    protected T self() {
        return (T) this;
    }

}
