package Functional_Programming_Exercises;

import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersAsString = scanner.nextLine().split(" ");
        int minValue = Integer.MAX_VALUE;
        int current = 0;

        Function<String, Integer> parser = x -> Integer.parseInt(x);
        for (String s : numbersAsString) {
            current = parser.apply(s);
            if (current < minValue) {
                minValue = current;
            }
        }
        System.out.println(minValue);
    }
}
