package cts.seminar_3;

public class InventoryProduct implements Inventable
{
    private Product product;
    private int quantity = Inventable.QUANTITY_PRODUCT;

    public InventoryProduct(Product product, int quantity)
    {
        super();
        this.product = new Product(product);
        this.quantity = quantity;
    }
    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product p) {
        this.product = product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

