package com.design.patterns.creational.builder.facede;

public class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder at(String streetAddress) {
        person.setStreetAddress(streetAddress);
        return this;
    }

    public PersonAddressBuilder withPostalCode(int postalCode) {
        person.setPostcode(postalCode);
        return this;
    }

    public PersonAddressBuilder in(String city) {
        person.setCity(city);
        return this;
    }

}
