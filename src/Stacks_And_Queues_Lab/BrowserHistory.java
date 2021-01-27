package Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> urls = new ArrayDeque<>();

        String command = scanner.nextLine();

        while (!command.equals("Home")) {

            if (!command.equals("back")) {
                urls.push(command);
                System.out.println(command);
            }

            if (command.equals("back") && urls.size() < 2) {
                System.out.println("no previous URLs");
            } else if (command.equals("back") && urls.size() >= 2) {
                urls.pop();
                System.out.println(urls.peek());
            }

            command = scanner.nextLine();
        }
    }
}
