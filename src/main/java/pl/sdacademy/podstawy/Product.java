package pl.sdacademy.podstawy;

import java.math.BigDecimal;

public class Product {
    private  final String productName;
    private final BigDecimal price;

    public Product(String productName, BigDecimal price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
