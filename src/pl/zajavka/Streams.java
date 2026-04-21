package src.pl.zajavka;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {


    public static void main(String[] args) {
        List<String> stringList = List.of("V1", "V2", "V3");
        List<String> stream = stringList.stream()
                .peek(value -> System.out.println("value: " + value))
                .collect(Collectors.toList());
    }
}
