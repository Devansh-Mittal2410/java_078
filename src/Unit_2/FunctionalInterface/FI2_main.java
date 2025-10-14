package Unit_2.FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FI2_main {
    public static void main(String[] args) {
        Predicate<Integer>isEven = (n) -> n%2==0;
        System.out.println("Output of Predicate: " + isEven.test(4688));

        Function<Integer,Integer> square = (n) -> n*n;
        System.out.println("Output of Function: " + square.apply(2));

        Consumer<String> display = (msg) -> System.out.println(msg);
        display.accept("Output of Display: Hello World");

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Output of Supplier: " + randomValue.get());
    }
}
