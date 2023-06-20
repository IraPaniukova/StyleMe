package com.example.styleme;

public class Product {
    String name, code, price;
    //I have decided to have the price as a string because for this application it is going to be just a text
    int description;
    int image;

    public Product(String name, String code, String price, int description, int image) {
        this.name = name;
        this.code = code;
        this.price=price;
        this.description = description;
        this.image = image;
    }
    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
    public String getPrice() {
        return price;
    }
    public int getDescription() {
        return description;
    }
    public int getImage() {
        return image;
    }
}

