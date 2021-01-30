package Multidimensional_Arrays_Exercises;

import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsCols = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(rowsCols[0]);
        int cols = Integer.parseInt(rowsCols[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1, maxCol = -1;

        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                int currentSum = sumFromTopLeft(matrix, i, j);

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }


        System.out.println("Sum = " + maxSum);

        for (int row = maxRow; row <= maxRow + 2; row++) {
            for (int col = maxCol; col <= maxCol + 2; col++) {

                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static  int sumFromTopLeft(int[][] matrix, int row, int col){
        return matrix[row][col] +
                matrix[row + 1][col] +
                matrix[row + 2][col] +
                matrix[row][col + 1] +
                matrix[row][col + 2] +
                matrix[row + 1][col + 1] +
                matrix[row + 1][col + 2] +
                matrix[row + 2][col + 1] +
                matrix[row + 2][col + 2];
    }
}
