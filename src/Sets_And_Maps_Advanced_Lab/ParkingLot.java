package Sets_And_Maps_Advanced_Lab;

import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> parkingLot = new HashSet<>();
        String line = scanner.nextLine();

        while (!line.equals("END")) {
            String[] parts = line.split(", ");

            if(parts[0].equals("IN")) {
                parkingLot.add(parts[1]);
            } else {
                parkingLot.remove(parts[1]);
            }

            line = scanner.nextLine();
        }

        if(parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
            return;
        }

        for (String carNumber : parkingLot) {
            System.out.println(carNumber);
        }
    }
}
