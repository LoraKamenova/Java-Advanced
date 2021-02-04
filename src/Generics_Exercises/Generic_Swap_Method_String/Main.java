package Generics_Exercises.Generic_Swap_Method_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> list = new ArrayList<>();

        while (n-- > 0) {
            String line = scanner.nextLine();

            Box<String> box = new Box<>(line);

            list.add(box.toString());
        }

        String[] command = scanner.nextLine().split("\\s+");

        int firstIndex = Integer.parseInt(command[0]);
        int secondIndex = Integer.parseInt(command[1]);
        String first = list.get(firstIndex);
        String second = list.get(secondIndex);
        list.set(firstIndex, second);
        list.set(secondIndex, first);

        for (String s : list) {
            System.out.println(s);
        }

    }
}
