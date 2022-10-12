package com.icecream;

import java.util.ArrayList;
import java.util.List;

public class IceCream {
    private String name;
    private int cost;
    private int numScoops;
    private List<String> toppings;

    public IceCream(String name, int cost, int numScoops) {
        this.name = name;
        this.cost = cost;
        this.numScoops = numScoops;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping){
        toppings.add(topping);
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getNumScoops() {
        return numScoops;
    }

    public void printToppings(){
        System.out.println("Toppings:");
        for(String topping : toppings){
            System.out.println("-- "+topping);
        }
    }
}