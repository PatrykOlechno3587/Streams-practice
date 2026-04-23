package src.pl.zajavka.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> consumer1 = x -> {
            extracted(x);
        };
//        consumer1.accept("Autobus");
    }

    private static void extracted(String x) {
        System.out.println("calling accept");
        System.out.println(x);
    }
}
