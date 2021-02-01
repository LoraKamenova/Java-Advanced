package Sets_And_Maps_Advanced_Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();

        while (!resource.equals("stop")) {

            if (result.containsKey(resource)) {
                result.put(resource, result.get(resource) + quantity);
            } else {
                result.put(resource, quantity);
            }
            resource = scanner.nextLine();
            if(resource.equals("stop")) {
                break;
            } else {
                quantity = Integer.parseInt(scanner.nextLine());
            }
        }

        for (String item : result.keySet()) {
            System.out.printf("%s -> %d\n", item, result.get(item));

        }
    }
}