package cts.seminar_3;

import java.util.ArrayList;

public class Order
{
    private ArrayList<Product> products;
    private String address;

    public Order() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product)
    {
        if(products.size() > 99) return;
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
