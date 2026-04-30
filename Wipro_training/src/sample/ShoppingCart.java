package sample;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {

        // product -> price
        HashMap<String, Integer> priceMap = new HashMap<>();
        priceMap.put("Laptop", 50000);
        priceMap.put("Phone", 20000);
        priceMap.put("Headphones", 2000);

        // cart items
        List<String> cart = new ArrayList<>();

        cart.add("Laptop");
        cart.add("Phone");
        cart.add("Headphones");

        int total = 0;

        for (String item : cart) {
            if (priceMap.containsKey(item)) {
                total += priceMap.get(item);
            }
        }

        System.out.println("Cart items: " + cart);
        System.out.println("Total price: " + total);
    }
}