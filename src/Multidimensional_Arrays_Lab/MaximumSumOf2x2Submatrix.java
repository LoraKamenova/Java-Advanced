package Multidimensional_Arrays_Lab;

import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsCols[0]);
        int cols = Integer.parseInt(rowsCols[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1, maxCol = -1;

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                int currentSum = sumFromTopLeft(matrix, i, j);

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.printf("%d %d\n%d %d\n%d",
                matrix[maxRow][maxCol],
                matrix[maxRow][maxCol + 1],
                matrix[maxRow + 1][maxCol],
                matrix[maxRow + 1][maxCol + 1],
                maxSum);
    }
    private static  int sumFromTopLeft(int[][] matrix, int row, int col){
        return matrix[row][col] +
                matrix[row + 1][col] +
                matrix[row][col + 1] +
                matrix[row + 1][col + 1];
    }
}
