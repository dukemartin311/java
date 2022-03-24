package ca.duke.lambdas;

import ca.duke.lambdas.printer.Printer;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdasDemo {
    public static String prefix = "-";

    public static void show() {

        List<String> listString = Arrays.asList("a","b","c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item-> System.out.println(item.toUpperCase(Locale.ROOT));

        listString.forEach(print.andThen(printUpperCase));

        Function<String, Integer> getlength = test -> test.length();
        System.out.println(getlength.apply("stringLength"));

        greet(message -> System.out.println(message));
        greet(LambdasDemo::print);

    }

    public static void greet (Printer printer) {
        printer.print("Hello world!!");
    }

    private static void print(String message) {
        System.out.println(prefix + message);
    }
}
