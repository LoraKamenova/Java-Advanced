package Sets_And_Maps_Advanced_Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lengths = scanner.nextLine().split(" ");
        int firstLength = Integer.parseInt(lengths[0]);
        int secondLength = Integer.parseInt(lengths[1]);

        LinkedHashSet<Integer> firstSetOfNumbers = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSetOfNumbers = new LinkedHashSet<>();

        for (int i = 0; i < firstLength; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            firstSetOfNumbers.add(n);
        }

        for (int i = 0; i < secondLength; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            secondSetOfNumbers.add(n);
        }

        for (Integer number : firstSetOfNumbers) {
            if (secondSetOfNumbers.contains(number)) {
                System.out.print(number + " ");
            }
        }
    }

}
