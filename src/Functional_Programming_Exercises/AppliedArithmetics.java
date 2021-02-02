package Functional_Programming_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersAsString = scanner.nextLine().split(" ");
        int[] numbers = Arrays.stream(numbersAsString).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.equals("add")) {
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] += 1;
                }

            } else if (command.equals("multiply")) {
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] *= 2;
                }
            } else if (command.equals("subtract")) {
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] -= 1;
                }
            } else if (command.equals("print")) {
                for (int i = 0; i < numbers.length; i++) {
                    System.out.print(numbers[i] + " ");
                }
                System.out.println();
            }
            command = scanner.nextLine();
        }
    }
}
