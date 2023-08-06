package entities;

public class Product {
    String name;
    Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
