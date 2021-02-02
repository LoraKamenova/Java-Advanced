package Functional_Programming_Exercises;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split(" ");

        for (String name : names) {
            Predicate<String> checkLength =
                    s -> s.length() <= n;

            if (checkLength.test(name)) {
                System.out.println(name);
            }
        }
    }
}
