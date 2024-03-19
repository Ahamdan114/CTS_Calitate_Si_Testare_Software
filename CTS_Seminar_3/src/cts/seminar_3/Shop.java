package cts.seminar_3;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String image;
    private ArrayList<Product> products;

    public Shop(String name, String image, ArrayList<Product> products)
    {
        this.products = new ArrayList<Product>();
        this.image = image;
        this.name = name;
    }

    public void modifyProductsList(int what, Product p)
    {
        if(what == 1) this.products.add(p);
        else this.products.remove(p);
    }

    public String getOnlineShopName() {
        return this.name;
    }

    public void setOnlineShopName(String onlineShopName) {
        this.name = onlineShopName;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String img) {
        this.image = img;
    }
}
