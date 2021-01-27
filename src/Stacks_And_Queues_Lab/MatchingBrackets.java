package Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Integer> bracketIndex = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                bracketIndex.push(i);
            } else if (input.charAt(i) == ')') {
                int startIndex = bracketIndex.pop();
                String bracketString = input.substring(startIndex, i + 1);
                System.out.println(bracketString);
            }
        }
    }
}
