package Sets_And_Maps_Advanced_Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String email = scanner.nextLine();
        LinkedHashMap<String, String> emails = new LinkedHashMap<>();
        LinkedHashMap<String, String> nonValidEmails = new LinkedHashMap<>();

        while (!name.equals("stop")) {

            if(email.toLowerCase().endsWith("us") || email.toLowerCase().endsWith("uk") ||
                    email.toLowerCase().endsWith("com")) {
                nonValidEmails.put(name, email);
            } else {
                emails.put(name, email);
            }

            name = scanner.nextLine();
            if(name.equals("stop")) {
                break;
            } else {
                email = scanner.nextLine();
            }
        }

        for (String contact : emails.keySet()) {
            System.out.printf("%s -> %s\n", contact, emails.get(contact));

        }
    }
}
