package ca.duke;

import ca.duke.lambdas.LambdasDemo;
import ca.duke.streams.StreamsDemo;

public class JavaClass {
    public static void main (String args[]) {
        System.out.println("Stream Demo");
        StreamsDemo.show();

        System.out.println("----------------------");

        System.out.println("Lambdas Demo");
        LambdasDemo.show();
    }
}
