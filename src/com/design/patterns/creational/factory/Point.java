package com.design.patterns.creational.factory;

/**
 * Architecture where we have multiple factory methods and we want to group them on basis of business scenario
 */
public class Point {

    private double x;
    private double y;

    // force user to use factory method to create new instance of Point
    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static class PointFactory {
        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }

        public static Point newPolarPoint(double rho, double theta) {
            return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
