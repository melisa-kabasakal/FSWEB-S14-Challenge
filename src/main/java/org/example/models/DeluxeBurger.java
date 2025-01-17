package org.example.models;

import java.util.PrimitiveIterator;

public class DeluxeBurger extends Hamburger {
    private String cips;
    private String drink;

public DeluxeBurger(){
    super("Deluxe Burger", "beef", 19.10, "bread");
    this.cips = "CURVY" ;
    this.drink = "COKE";
}

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String name, double price){
    System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price){
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }
    @Override
    public void addHamburgerAddition3(String name, double price){
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }
    @Override
    public void addHamburgerAddition4(String name, double price){
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }
}
