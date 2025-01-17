package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return itemizeHamburger();
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double totalPrice = this.price;

        if(addition1Name != null && addition1Price > 0){
            totalPrice += addition1Price;
        }
        if(addition2Name != null && addition2Price > 0){
            totalPrice += addition2Price;
        }
        if(addition3Name != null && addition3Price > 0){
            totalPrice += addition3Price;
        }
        if(addition4Name != null && addition4Price > 0){
            totalPrice += addition4Price;
        }
        return totalPrice;
    }
}
