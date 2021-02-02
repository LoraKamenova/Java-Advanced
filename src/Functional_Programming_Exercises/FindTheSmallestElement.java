package Functional_Programming_Exercises;

import java.util.Scanner;
import java.util.function.Function;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersAsString = scanner.nextLine().split("\\s+");

        int current = 0;
        int minValue = Integer.MAX_VALUE;
        int index = -1;

        Function<String, Integer> parser = x -> Integer.parseInt(x);

        for (int i = 0; i < numbersAsString.length; i++) {
            current = parser.apply(numbersAsString[i]);
            if (current <= minValue) {
                minValue = current;
                index = i;
            }
        }

        System.out.println(index);
    }
}
