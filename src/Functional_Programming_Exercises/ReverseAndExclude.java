package Functional_Programming_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersAsString = scanner.nextLine().split(" ");
        int[] numbers = Arrays.stream(numbersAsString).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());

        int[] filteredNums = Arrays.stream(numbers).filter(x -> x % n != 0).toArray();

        for (int i = filteredNums.length - 1; i >= 0; i--) {
            System.out.print(filteredNums[i] + " ");
        }
    }
}
