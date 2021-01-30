package Multidimensional_Arrays_Exercises;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsCols = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(rowsCols[0]);
        int cols = Integer.parseInt(rowsCols[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols ; col++) {
                matrix[row][col] = fillWithPalindrome(row, col);
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static String fillWithPalindrome(int row, int col) {
        char firstLetter = (char)(97 + row);
        char secondLetter = (char)(97 + row + col);
        char thirdLetter = (char)(97 + row);

        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(firstLetter);
        sb.append(secondLetter);
        sb.append(thirdLetter);
        str = sb.toString();

        return str;
    }
}

