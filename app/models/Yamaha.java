package models;


import scala.math.Ordering;

/**
 * Created by Warangkhana_P on 24/7/2561.
 */
 public class Yamaha {
    private String id, name, brand;
    private int Price;


    //Constructor method


    public Yamaha() {
    }

    public Yamaha(String id, String name, String brand, int price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        Price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}