package com.circle;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(15.2);
        Circle circle3 = new Circle();
        circle3.setRadius(7);

        printCircle(circle1);
        printCircle(circle2);
        printCircle(circle3);
    }

    private static void printCircle(Circle circle) {
        System.out.println("r : " + circle.getRadius());
        System.out.println("c : " + circle.circumference());
        System.out.println("a : " + circle.area());
        System.out.println();
    }
}
