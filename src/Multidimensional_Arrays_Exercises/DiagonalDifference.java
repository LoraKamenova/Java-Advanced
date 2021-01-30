package Multidimensional_Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = rowData;
        }

        int sumOfFirstDiagonal = 0;
        int sumOfSecondDiagonal = 0;
        int difference = 0;

        for (int i = 0; i < n; i++) {
            sumOfFirstDiagonal += matrix[i][i];
        }

        for (int i = 0; i < n; i++) {
            sumOfSecondDiagonal += matrix[n - 1 - i][i];
        }
        difference = Math.abs(sumOfFirstDiagonal - sumOfSecondDiagonal);

        System.out.println(difference);
    }
}
