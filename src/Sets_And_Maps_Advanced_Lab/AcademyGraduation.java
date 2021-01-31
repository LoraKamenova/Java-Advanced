package Sets_And_Maps_Advanced_Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Double> studentScore = new TreeMap<>();
        int rowCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rowCount; i++) {
            String studentName = scanner.nextLine();
            Double avrgScore = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .average()
                    .getAsDouble();

            studentScore.put(studentName, avrgScore);
        }

        for (String studentName : studentScore.keySet()) {
            System.out.println(studentName + " is graduated with " + studentScore.get(studentName));
        }
    }
}
