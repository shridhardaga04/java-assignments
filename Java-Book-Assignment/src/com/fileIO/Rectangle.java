package com.fileIO;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(){
        this(1.0,1.0);
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double area(){
        return length * breadth;
    }

    public double perimeter(){
        return 2 * (length + breadth);
    }
}
