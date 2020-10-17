package org.oop;

public class Point {
    private double x;
    private double y;

    public double calculateXDistanceFrom(Point From) {
        return this.x - From.x;
    }

    public double calculateYDistanceFrom(Point From) {
        return this.y - From.y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
