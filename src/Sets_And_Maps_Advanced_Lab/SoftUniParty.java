package Sets_And_Maps_Advanced_Lab;

import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> guestList = new TreeSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")) {
            guestList.add(input);

            input = scanner.nextLine();
        }

        while (!input.equals("END")) {
            guestList.remove(input);

            input = scanner.nextLine();
        }

        System.out.println(guestList.size());
        for (String guestId : guestList) {
            System.out.println(guestId);
        }
    }
}
