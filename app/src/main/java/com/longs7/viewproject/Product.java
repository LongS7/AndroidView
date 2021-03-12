package com.longs7.viewproject;

public class Product {
    private int imageResource;
    private String name;
    private int price;

    public Product() {
    }

    public Product(int imageResource, String name, int price) {
        this.imageResource = imageResource;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "imageResource=" + imageResource +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
