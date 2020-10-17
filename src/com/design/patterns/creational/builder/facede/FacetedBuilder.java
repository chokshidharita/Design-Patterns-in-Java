package com.design.patterns.creational.builder.facede;

public class FacetedBuilder {

    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .lives()
                .at("14 Linked street")
                .withPostalCode(123490)
                .in("Amsterdam")
                .works()
                .at("Monte Carlo")
                .asA("Senior Executive")
                .earning(150000)
                .build();

        System.out.println(person);

        /*
        This architecture is used when we have complicated domain object. We can create different builders based on the
        business logic.
         */
    }

}
