package com.design.patterns.creational.factory.problem;

public class Point {

    private double x;
    private double y;

    /**
     * @param a                is x if cartesian else rho if polar
     * @param b                is y if cartesian else theta if polar
     * @param coordinateSystem
     */
    public Point(double a, double b, CoordinateSystem coordinateSystem) {
        switch (coordinateSystem) {
            case CARTESIAN:
                this.x = a;
                this.y = b;
                break;
            case POLAR:
                this.x = a * Math.cos(b);
                this.y = a * Math.sin(b);
                break;
        }
    }
    /*
     Adding such switch cases in constructor looks ugly. Also the user is confused on what is a and b. Adding such
     comment doesn't looks like a good coding practise.
     */
}
