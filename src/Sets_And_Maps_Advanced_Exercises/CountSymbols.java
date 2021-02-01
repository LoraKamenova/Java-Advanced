package Sets_And_Maps_Advanced_Exercises;

import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();

        TreeMap<Character,Integer> countOfChars = new TreeMap<>();

        for (int i = 0; i < charArray.length; i++) {
            if(countOfChars.containsKey(charArray[i])) {
                countOfChars.put(charArray[i], countOfChars.get(charArray[i]) + 1);
            } else {
                countOfChars.put(charArray[i], 1);
            }
        }

        for (Character character : countOfChars.keySet()) {
            System.out.printf("%s: %d time/s\n", character, countOfChars.get(character));
        }
    }
}
