package Sets_And_Maps_Advanced_Lab;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerInput = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        LinkedHashSet<Integer> firstPlayer = new LinkedHashSet<>();
        firstPlayer.addAll(firstPlayerInput);


        List<Integer> secondPlayerInput = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        LinkedHashSet<Integer> secondtPlayer = new LinkedHashSet<>();
        secondtPlayer.addAll(secondPlayerInput);

        for (int round = 0; round < 50; round++) {
            if (firstPlayer.isEmpty()) {
                System.out.println("Second player win!");
                return;
            }

            if (secondtPlayer.isEmpty()) {
                System.out.println("First player win!");
                return;
            }

            Integer firstPlayerCard = getTopValue(firstPlayer);
            Integer secondPlayerCard = getTopValue(secondtPlayer);

            firstPlayer.remove(firstPlayerCard);
            secondtPlayer.remove(secondPlayerCard);

            if(firstPlayerCard > secondPlayerCard) {
                firstPlayer.add(firstPlayerCard);
                firstPlayer.add(secondPlayerCard);
            } else if (firstPlayerCard < secondPlayerCard){
                secondtPlayer.add(firstPlayerCard);
                secondtPlayer.add(secondPlayerCard);
            } else {
                firstPlayer.add(firstPlayerCard);
                secondtPlayer.add(secondPlayerCard);
            }
        }

        Integer firstPlayerDeckSize = firstPlayer.size();
        Integer secondPlayerDeckSize = secondtPlayer.size();

        if(firstPlayerDeckSize > secondPlayerDeckSize) {
            System.out.println("First player win!");
        } else if (secondPlayerDeckSize > firstPlayerDeckSize) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }

    private static Integer getTopValue(LinkedHashSet<Integer> set) {
        for (Integer integer : set) {
            return integer;
        }
        return 0;
    }
}
