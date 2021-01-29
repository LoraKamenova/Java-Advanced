package Multidimensional_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsCols[0]);
        int cols = Integer.parseInt(rowsCols[1]);

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .sum();
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }

}
