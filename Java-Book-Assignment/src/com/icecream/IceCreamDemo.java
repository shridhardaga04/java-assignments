package com.icecream;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream ic = new IceCream("Chocolate", 50, 2);
        ic.addTopping("Choco-chips");
        ic.addTopping("Sprinkles");
        printIceCream(ic);
    }

    public static void printIceCream(IceCream iceCream){
        System.out.println(iceCream.getName());
        System.out.println("Cost : "+ iceCream.getCost());
        iceCream.printToppings();
    }
}
