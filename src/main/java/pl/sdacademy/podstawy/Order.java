package pl.sdacademy.podstawy;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Order {
    private final int qty;
    private final String customerName;
    private final double cost;
    private final LocalDate addDate;
    private final Product product;

    public Order(int qty, String customerName, double cost, LocalDate addDate, Product product) {
        this.qty = qty;
        this.clientName = customerName;
        this.cost = cost;
        this.addDate = addDate;
        this.product = product;
    }

    public double cost (int qty, BigDecimal price){
        return qty * price.doubleValue();
    }

    public int getQty() {
        return qty;
    }

    public String getClientName() {
        return customerName;
    }

    @Override
    public String toString() {
        return qty + " " + customerName;
    }
}
