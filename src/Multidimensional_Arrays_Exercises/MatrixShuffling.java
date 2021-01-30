package Multidimensional_Arrays_Exercises;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsCols = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(rowsCols[0]);
        int cols = Integer.parseInt(rowsCols[1]);

        String[][] matrix = new String[rows][cols];

        int coordinateX1 = -1;
        int coordinateY1 = -1;
        int coordinateX2 = -1;
        int coordinateY2 = -1;

        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = line[j];
            }
        }

        String line = scanner.nextLine();

        while (!line.equals("END")) {
            String[] input = line.split(" ");
            if (input.length == 5) {
                coordinateX1 = Integer.parseInt(input[1]);
                coordinateY1 = Integer.parseInt(input[2]);
                coordinateX2 = Integer.parseInt(input[3]);
                coordinateY2 = Integer.parseInt(input[4]);
            }

            if (!input[0].equals("swap") || input.length != 5) {
                System.out.println("Invalid input!");
            } else if ((coordinateX1 < 0 || coordinateX1 > rows - 1) ||
                    (coordinateY1 < 0 || coordinateY1 > cols - 1) ||
                    (coordinateX2 < 0 || coordinateX2 > rows - 1) ||
                    (coordinateY2 < 0 || coordinateY2 > cols - 1)) {
                System.out.println("Invalid input!");
            } else {
                String oldValue = matrix[coordinateX2][coordinateY2];
                matrix[coordinateX2][coordinateY2] = matrix[coordinateX1][coordinateY1];
                matrix[coordinateX1][coordinateY1] = oldValue;
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {

                        System.out.print(matrix[row][col] + " ");
                    }
                    System.out.println();
                }
            }
            line = scanner.nextLine();
        }
    }
}

