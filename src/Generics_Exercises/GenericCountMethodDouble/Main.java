package Generics_Exercises.GenericCountMethodDouble;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());

        List<Box<Double>> listOfBoxes = new ArrayList<>();

        while (n-- > 0) {
            double line = Double.parseDouble(scanner.nextLine());
            Box<Double> box = new Box<>(line);
            listOfBoxes.add(box);
        }

        double line = Double.parseDouble(scanner.nextLine());
        Box<Double> comparatorBox = new Box<>(line);
        System.out.println(countGreaterValues(listOfBoxes, comparatorBox));
    }

    public static <T extends Comparable<T>> int countGreaterValues(List<Box<T>> list, Box<T> box) {
        int counter = 0;
        for (Box<T> t : list) {
            if (t.compareTo(box) > 0) {
counter++;
            }
        }
        return counter;
    }
}
