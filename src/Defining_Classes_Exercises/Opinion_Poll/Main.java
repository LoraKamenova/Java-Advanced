package Defining_Classes_Exercises.Opinion_Poll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        ArrayList<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            Person person = new Person(data[0], Integer.parseInt(data[1]));

            people.add(person);
        }

        people.stream().sorted(Comparator.comparing(Person::getName))
                .filter(p -> p.getAge() > 30)
                .forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));
    }
}
