package pl.sdacademy.podstawy;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product carrot = new Product("carrot",new BigDecimal(2.5));
        Product coffee = new Product("coffee", new BigDecimal(10.75));
        Product nuts = new Product("nuts", new BigDecimal(5.2));
        Product drink = new Product("drink", new BigDecimal(2.99));
        Product sugar = new Product("sugar", new BigDecimal(2.14));

        Order number1 = new Order(10,"company1",123, LocalDate.of(2021,27,02),carrot);
    }
}
