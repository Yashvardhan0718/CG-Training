package week4.day2.level3;

import java.util.*;

public class shop {

    static class Cart {
        private Map<String, Double> priceMap = new HashMap<>();
        private LinkedHashMap<String, Integer> cartItems = new LinkedHashMap<>();

        public void addProduct(String name, double price) {
            priceMap.put(name, price);
            cartItems.put(name, cartItems.getOrDefault(name, 0) + 1);
        }

        public void displayCartOrder() {
            System.out.println("Cart Items (Order Added):");
            for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
                String product = entry.getKey();
                int quantity = entry.getValue();
                double price = priceMap.get(product);
                System.out.println(product + " x" + quantity + " @ ₹" + price);
            }
        }

        public void displayCartSortedByPrice() {
            System.out.println("Cart Items (Sorted by Price):");
            TreeMap<Double, List<String>> sortedByPrice = new TreeMap<>();

            for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
                String product = entry.getKey();
                double price = priceMap.get(product);
                sortedByPrice.computeIfAbsent(price, k -> new ArrayList<>()).add(product);
            }

            for (Map.Entry<Double, List<String>> entry : sortedByPrice.entrySet()) {
                double price = entry.getKey();
                for (String product : entry.getValue()) {
                    int quantity = cartItems.get(product);
                    System.out.println(product + " x" + quantity + " @ ₹" + price);
                }
            }
        }

        public double getTotalAmount() {
            double total = 0;
            for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
                total += priceMap.get(entry.getKey()) * entry.getValue();
            }
            return total;
        }
    }

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProduct("Laptop", 55000);
        cart.addProduct("Mouse", 500);
        cart.addProduct("Keyboard", 1500);
        cart.addProduct("Laptop", 55000);
        cart.addProduct("Monitor", 12000);

        cart.displayCartOrder();
        System.out.println();
        cart.displayCartSortedByPrice();
        System.out.println();
        System.out.println("Total: ₹" + cart.getTotalAmount());
    }
}
