package Stacks_And_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nums = scanner.nextLine().split("\\s+");
        int elementsToPush = Integer.parseInt(nums[0]);
        int elementsToPop = Integer.parseInt(nums[1]);
        int elementToCheck = Integer.parseInt(nums[2]);

        String[] queueOfNumbers = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int smallestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < elementsToPush; i++) {
            queue.add(Integer.parseInt(queueOfNumbers[i]));
        }

        for (int i = 0; i < elementsToPop; i++) {
            queue.poll();
        }

        if (queue.isEmpty()) {
            System.out.println(0);
        } else if (queue.contains(elementToCheck)) {
            System.out.println("true");
        } else {
            while (!queue.isEmpty()){
                int number = queue.poll();
                if (number < smallestNumber) {
                    smallestNumber = number;
                }
            }
            System.out.println(smallestNumber);
        }

    }
}
