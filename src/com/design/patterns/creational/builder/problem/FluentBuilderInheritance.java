package com.design.patterns.creational.builder.problem;

public class FluentBuilderInheritance {

    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person spiderMan = personBuilder.withName("SpiderMan").build();
        System.out.println(spiderMan);

        EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        Person ironMan = employeeBuilder.worksAs("Avengers").build();
        System.out.println(ironMan);

        /* When we try to set name in build EmployeeBuilder then it will return PersonBuilder (i.e. its Parent Builder)
           and thus we are not able to set its designation after that
           example: employeeBuilder.withName("SpiderMan").worksAs("Avengers").build()
         */
    }

}
