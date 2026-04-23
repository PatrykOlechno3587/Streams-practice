package src.pl.zajavka.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Integer> supplier1 = () -> {
            System.out.println("calling supplier");

        return 223;
        };


        System.out.println(supplier1.get());
    }
}
