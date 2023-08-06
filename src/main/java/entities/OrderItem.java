package entities;

public class OrderItem {
    Integer quantity;
    Double price;

    Product product;

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.price = product.getPrice();
        this.product = product;
    }

    public Double subTotal() {
        return quantity * price;
    }
}
