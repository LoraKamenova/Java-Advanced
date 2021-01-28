package Stacks_And_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nums = scanner.nextLine().split("\\s+");
        int elementsToPush = Integer.parseInt(nums[0]);
        int elementsToPop = Integer.parseInt(nums[1]);
        int elementToCheck = Integer.parseInt(nums[2]);

        String[] stackOfNumbers = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int smallestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < elementsToPush; i++) {
            stack.push(Integer.parseInt(stackOfNumbers[i]));
        }

        for (int i = 0; i < elementsToPop; i++) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(elementToCheck)) {
            System.out.println("true");
        } else {
            while (!stack.isEmpty()){
                int number = stack.pop();
                if (number < smallestNumber) {
                    smallestNumber = number;
                }
            }
            System.out.println(smallestNumber);
        }

    }
}
