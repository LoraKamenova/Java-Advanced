package Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> tokens = new ArrayDeque<>();

        if (number == 0) {
            System.out.println("0");
        } else {
            while (number > 0) {
                tokens.push(number % 2);
                number /= 2;
            }
        }

        while (!tokens.isEmpty()) {
            System.out.print(tokens.pop());
        }

    }
}
