package Sets_And_Maps_Advanced_Exercises;

import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        HashMap<String, String> phonebook = new HashMap<>();

        while (!str.equals("search")) {
            String[] contact = str.split("-");
            phonebook.put(contact[0], contact[1]);
            str = scanner.nextLine();
        }

        str = scanner.nextLine();
        while (!str.equals("stop")) {
            if(phonebook.containsKey(str)) {
                System.out.println(str + " -> " + phonebook.get(str));
            } else {
                System.out.println("Contact "+ str +" does not exist.");
            }

            str = scanner.nextLine();
        }
    }
}