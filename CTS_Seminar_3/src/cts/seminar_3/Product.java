package cts.seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Product implements Inventable
{
    private int id;
    private String name;
    private double price;
    private int type;
    private int category;
    private int quantity = Inventable.QUANTITY_PRODUCT;
    private String date_expiration; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String name, double price, int type, int category, int id, String date_expiration) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.category = category;
        this.date_expiration = date_expiration;
    }

    public Product(Product product) {
        this.id = product.id;
        this.name = product.name;
        this.price = product.price;
        this.type = product.type;
        this.category = product.category;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean equals(Product product)
    {
        boolean productComparison = product.id != this.id;
        boolean nameComparison = product.name.equals(this.name);
        boolean priceComparison = product.price != this.price;
        boolean typeComparison = this.type != product.type;
        boolean categoryComparison = product.category != this.category;

        ArrayList<Boolean> conditions = new ArrayList<>(Arrays.asList(
                productComparison, nameComparison, priceComparison, typeComparison, categoryComparison
        ));


        List<Boolean> checkerArr = conditions.stream()
                .filter(condition -> {
                    if(!condition) return true;
                    return false;
                }).toList();

        if(checkerArr.size() > 0) return false;
        return true;
    }

    public void modify(boolean isFlag, double val)
    {
        if(!isFlag) this.price -= this.price * val /100;
        else this.price += this.price * val;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return this.details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
