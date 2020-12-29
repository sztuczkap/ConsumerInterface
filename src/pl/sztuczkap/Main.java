package pl.sztuczkap;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class Main {

    public static void main(String[] args) {

        Consumer<Integer> consumer = System.out::println;

        Consumer<Integer> secondConsumer = consumer.andThen(number -> {
            for (int i = 0; i < number; i++) {
                System.out.println("Hello");
            }
        });
//        secondConsumer.accept(4);


        BiConsumer<String, Integer> biConsumer = (text, number) -> {
            System.out.println(text + " " + number);
        };

//        biConsumer.accept("Hell", 1);

        ObjIntConsumer<String> objIntConsumer = (text, number) -> {
            System.out.println(text + " " + number);
        };

//        objIntConsumer.accept("Hi", 2);

        List.of(1, 2, 3, 4).forEach((number) -> System.out.println(number));
        Map.of(1, "One", 2, "Two", 3, "Three").forEach((num, text) -> {
            System.out.println(num + " " + text);
        });

    }
}
