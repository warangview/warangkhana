package models;

/**
 * Created by Warangkhana_P on 26/7/2561.
 */
public class Add {
    private  String id,name,brand;
    private  double price;
    private  int amount;

    public Add() {
    }

    public Add(String id, String name, String brand, double price, int amount) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.amount = amount;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
