package src.pl.zajavka.FunctionalInterface;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<Car, String> functionImpl = c -> {
            System.out.println("c printing: " + c);
            return "someString";
        };

        String apply = functionImpl.apply(new Car());
        System.out.println(apply);
    }


    static class Car{}
}
