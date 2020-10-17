package com.design.patterns.creational.builder.solution;

import com.design.patterns.creational.builder.problem.Person;

public class FluentBuilderInheritance {

    public static void main(String[] args) {
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        Person ironMan = employeeBuilder.withName("IronMan").worksAs("Avengers").build();
        System.out.println(ironMan);

    }

}
