package com.fileIO;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius > 0)
            this.radius = radius;
        else
            System.out.println("Invalid radius: Radius can not be less than zero");
    }

    public double circumference(){
        return Math.round(2 * Math.PI * radius * 100.0) / 100.0;
    }

    public double area(){
        return Math.round(Math.PI * Math.pow(radius,2) * 100.0) / 100.0;
    }
}
