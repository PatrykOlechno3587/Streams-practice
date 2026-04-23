package src.pl.zajavka.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Szczecin");
        cities.add("Poznań");
        cities.add("Gdynia");
        cities.add("Tarnów");

        print(cities, a-> a.contains("P"));

    }


    private static void print(final List<String> cities, Predicate<String> tester){
        for (String city : cities) {
            if (tester.test(city)){
                System.out.println(city);
            }

        }

    }
}
