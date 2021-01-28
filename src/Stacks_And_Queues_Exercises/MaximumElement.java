package Stacks_And_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (n-- > 0) {
            String[] nums = scanner.nextLine().split("\\s+");
            String command = nums[0];
            switch (command) {
                case "1":

                    int elementToPush = Integer.parseInt(nums[1]);
                    stack.push(elementToPush);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    int biggestNumber = Collections.max(stack);
                    System.out.println(biggestNumber);
                    break;
            }
        }
    }
}
