import java.util.ArrayList;

import cts.seminar_3.*;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop("Emag", "logo.jpg", new ArrayList<Product>());

        Product first_product = new Product("Laptop", 3200.5, 1,1, 1123, "");
        Product second_product = new Product("Frigider", 207.95, 1,2, 1245, "");

        Product third_product = new Product(first_product);

        third_product.setQuantity(5);
        third_product.setName("Paine");

        shop.modifyProductsList(1,first_product);
        shop.modifyProductsList(1,second_product);

        shop.modifyProductsList(2, first_product);
        System.out.println(first_product.equals(second_product));
    }
}

