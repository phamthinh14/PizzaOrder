package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    String normalDough;
    String glutenFreeDough;
    String redSauce;
    String whiteSauce;
    String americanCheese;
    String mozzarellaCheese;
    String fetaCheese;
    String veggies;
    String protein;
    String beef;
    String chicken;
    String pork;
    String pepperoni;
    String seafood;
    double price;

    public Order() {
//        this.dough = "Normal Dough";
//        this.dough = "Red Sauce";
//        this.cheese = "American";
//        this.toppings = "Beef";
        this.price = 5.75;
    }

    public Order(String normalDough, String glutenFreeDough, String redSauce, String whiteSauce,
                 String americanCheese, String mozzarellaCheese, String fetaCheese, String veggies,
                 String protein, String beef, String chicken, String pork, String pepperoni, String seafood) {
        this.normalDough = normalDough;
        this.glutenFreeDough = glutenFreeDough;
        this.redSauce = redSauce;
        this.whiteSauce = whiteSauce;
        this.americanCheese = americanCheese;
        this.mozzarellaCheese = mozzarellaCheese;
        this.fetaCheese = fetaCheese;
        this.veggies = veggies;
        this.protein = protein;
        this.beef = beef;
        this.chicken = chicken;
        this.pork = pork;
        this.pepperoni = pepperoni;
        this.seafood = seafood;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNormalDough() {
        return normalDough;
    }

    public void setNormalDough(String normalDough) {
        this.normalDough = normalDough;
    }

    public String getGlutenFreeDough() {
        return glutenFreeDough;
    }

    public void setGlutenFreeDough(String glutenFreeDough) {
        this.glutenFreeDough = glutenFreeDough;
    }

    public String getRedSauce() {
        return redSauce;
    }

    public void setRedSauce(String redSauce) {
        this.redSauce = redSauce;
    }

    public String getWhiteSauce() {
        return whiteSauce;
    }

    public void setWhiteSauce(String whiteSauce) {
        this.whiteSauce = whiteSauce;
    }

    public String getAmericanCheese() {
        return americanCheese;
    }

    public void setAmericanCheese(String americanCheese) {
        this.americanCheese = americanCheese;
    }

    public String getMozzarellaCheese() {
        return mozzarellaCheese;
    }

    public void setMozzarellaCheese(String mozzarellaCheese) {
        this.mozzarellaCheese = mozzarellaCheese;
    }

    public String getFetaCheese() {
        return fetaCheese;
    }

    public void setFetaCheese(String fetaCheese) {
        this.fetaCheese = fetaCheese;
    }

    public String getVeggies() {
        return veggies;
    }

    public void setVeggies(String veggies) {
        this.veggies = veggies;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getBeef() {
        return beef;
    }

    public void setBeef(String beef) {
        this.beef = beef;
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getPork() {
        return pork;
    }

    public void setPork(String pork) {
        this.pork = pork;
    }

    public String getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(String pepperoni) {
        this.pepperoni = pepperoni;
    }

    public String getSeafood() {
        return seafood;
    }

    public void setSeafood(String seafood) {
        this.seafood = seafood;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
