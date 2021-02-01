package Sets_And_Maps_Advanced_Exercises;

import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<String> elements = new TreeSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] el = scanner.nextLine().split(" ");
            for (String s : el) {
                elements.add(s);
            }

        }

        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
