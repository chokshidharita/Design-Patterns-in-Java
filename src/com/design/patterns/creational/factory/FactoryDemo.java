package com.design.patterns.creational.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        Point cartesianPoint = Point.PointFactory.newCartesianPoint(20, 20);
        Point polarPoint = Point.PointFactory.newPolarPoint(2, 45);

        System.out.println(cartesianPoint);
        System.out.println(polarPoint);
    }
}
