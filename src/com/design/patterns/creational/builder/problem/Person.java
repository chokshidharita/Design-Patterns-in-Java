package com.design.patterns.creational.builder.problem;

public class Person {
    private String name;
    private String worksAs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorksAs() {
        return worksAs;
    }

    public void setWorksAs(String worksAs) {
        this.worksAs = worksAs;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", worksAs='" + worksAs + '\'' +
                '}';
    }
}
