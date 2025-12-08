import java.util.*;
import java.util.stream.Collectors;
 
public class demo2usingstreams {
 
    // Menu (ItemName → Price)
    private static final Map<String, Double> MENU = new LinkedHashMap<>();
 
    // Orders (ItemName → Quantity)
    private static final Map<String, Integer> ORDERS = new LinkedHashMap<>();
 
    static {
        MENU.put("Idli", 30.0);
        MENU.put("Dosa", 50.0);
        MENU.put("Fried Rice", 80.0);
        MENU.put("Paneer Curry", 120.0);
        MENU.put("Coffee", 25.0);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("========= Welcome to Sharavathi Restaurant =========");
 
        while (true) {
            System.out.println("\n1. View Menu");
            System.out.println("2. Place Order");
            System.out.println("3. View Bill");
            System.out.println("4. Apply Discount");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
 
            switch (choice) {
                case 1 -> viewMenu();
                case 2 -> placeOrder(sc);
                case 3 -> viewBill();
                case 4 -> applyDiscount(sc);
                case 5 -> {
                    System.out.println("Thank you! Visit Again 😊");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
 
    // 1️⃣ View menu using Stream forEach
    private static void viewMenu() {
        System.out.println("\n===== MENU =====");
        final int[] i = {1};
        MENU.entrySet().stream()
                .forEach(entry -> System.out.println(i[0]++ + ". " + entry.getKey() + " - ₹" + entry.getValue()));
    }
 
    // 2️⃣ Place order
    private static void placeOrder(Scanner sc) {
        viewMenu();
        System.out.print("\nEnter item name to order: ");
        sc.nextLine(); // consume newline
        String item = sc.nextLine().trim();
 
        if (!MENU.containsKey(item)) {
            System.out.println("❌ Item not found in the menu!");
            return;
        }
 
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
 
        ORDERS.merge(item, qty, Integer::sum);
        System.out.println(qty + " " + item + "(s) added successfully ✅");
    }
 
    // 3️⃣ View bill using Stream API
    private static void viewBill() {
        if (ORDERS.isEmpty()) {
            System.out.println("\nNo items ordered yet!");
            return;
        }
 
        System.out.println("\n===== BILL =====");
        double total = ORDERS.entrySet().stream()
                .peek(entry -> {
                    double price = MENU.get(entry.getKey());
                    double subtotal = price * entry.getValue();
                    System.out.println(entry.getKey() + " x " + entry.getValue() + " = ₹" + subtotal);
                })
                .mapToDouble(entry -> MENU.get(entry.getKey()) * entry.getValue())
                .sum();
 
        System.out.println("----------------------------");
        System.out.println("Total Amount: ₹" + total);
    }
 
    // 4️⃣ Apply discount using Stream reduce
    private static void applyDiscount(Scanner sc) {
        if (ORDERS.isEmpty()) {
            System.out.println("\nNo items ordered yet!");
            return;
        }
 
        double total = ORDERS.entrySet().stream()
                .mapToDouble(entry -> MENU.get(entry.getKey()) * entry.getValue())
                .sum();
 
        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();
 
        double finalAmount = total - (total * discount / 100);
 
        System.out.println("\n===== DISCOUNTED BILL =====");
        System.out.println("Original Total: ₹" + total);
        System.out.println("Discount (" + discount + "%): ₹" + (total * discount / 100));
        System.out.println("Final Amount: ₹" + finalAmount);
    }
}






public class demo2 {
    
}
