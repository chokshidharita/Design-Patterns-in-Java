package com.design.patterns.creational.factory.solution;

public class FactoryDemo {

    public static void main(String[] args) {
        Point cartesianPoint = Point.newCartesianPoint(10, 20);
        System.out.println(cartesianPoint);

        Point polarPoint = Point.newPolarPoint(2, 3);
        System.out.println(polarPoint);
    }
}
