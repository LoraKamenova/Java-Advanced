package Sets_And_Maps_Advanced_Lab;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, LinkedHashMap<String, Double>> shops = new TreeMap<>();
        String line = scanner.nextLine();

        while (!line.equals("Revision")) {
            String[] data = line.split(", ");
            String shopname = data[0];
            String productName = data[1];
            Double productPrice = Double.parseDouble(data[2]);

            LinkedHashMap<String, Double> products = new LinkedHashMap<>();
            if(shops.containsKey(shopname)) {
                products = shops.get(shopname);
            }

            products.put(productName, productPrice);
            shops.put(shopname, products);

            line = scanner.nextLine();
        }

        for (String shopName : shops.keySet()) {
            System.out.println(shopName + "->");
            LinkedHashMap<String, Double> products = shops.get(shopName);

            for (String productName : products.keySet()) {
                System.out.printf("Product: %s, Price: %.1f\n", productName, products.get(productName));
            }
        }
    }
}

