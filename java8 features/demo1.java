import java.util.*;
 
public class demo1 {
 
    // Menu represented as a Map (item -> price)
    static Map<String, Double> menu = new LinkedHashMap<>();
 
    // Selected orders
    static Map<String, Integer> order = new LinkedHashMap<>();
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // Initialize Menu
        menu.put("1. Idli", 30.0);
        menu.put("2. Dosa", 50.0);
        menu.put("3. Fried Rice", 80.0);
        menu.put("4. Paneer Curry", 120.0);
        menu.put("5. Coffee", 25.0);
 
        System.out.println("========= Welcome to Sharavathi Restaurant =========");
 
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. View Menu");
            System.out.println("2. Place Order");
            System.out.println("3. View Bill");
            System.out.println("4. Apply Discount");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
 
            int choice = sc.nextInt();
 
            switch (choice) {
                case 1:
                    viewMenu();
                    break;
                case 2:
                    placeOrder(sc);
                    break;
                case 3:
                    viewBill();
                    break;
                case 4:
                    applyDiscount(sc);
                    break;
                case 5:
                    System.out.println("\nThank you for visiting! 🍛");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
 
    // View menu
    public static void viewMenu() {
        System.out.println("\n===== MENU =====");
        for (Map.Entry<String, Double> item : menu.entrySet()) {
            System.out.println(item.getKey() + " - ₹" + item.getValue());
        }
    }
 
    // Place order
    public static void placeOrder(Scanner sc) {
        viewMenu();
        System.out.print("\nEnter item number to order (e.g. 1 for Idli): ");
        int itemNum = sc.nextInt();
        sc.nextLine(); // consume newline
 
        if (itemNum < 1 || itemNum > menu.size()) {
            System.out.println("Invalid item number!");
            return;
        }
 
        String selectedItem = (String) menu.keySet().toArray()[itemNum - 1];
 
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
 
        order.put(selectedItem, order.getOrDefault(selectedItem, 0) + qty);
        System.out.println(qty + " " + selectedItem + " added to your order!");
    }
 
    // View total bill
    public static void viewBill() {
        if (order.isEmpty()) {
            System.out.println("\nNo items ordered yet!");
            return;
        }
 
        double total = 0;
        System.out.println("\n===== BILL =====");
        for (Map.Entry<String, Integer> item : order.entrySet()) {
            double price = menu.get(item.getKey());
            double itemTotal = price * item.getValue();
            System.out.println(item.getKey() + " x " + item.getValue() + " = ₹" + itemTotal);
            total += itemTotal;
        }
        System.out.println("----------------------------");
        System.out.println("Total Amount: ₹" + total);
    }
 
    // Apply discount
    public static void applyDiscount(Scanner sc) {
        if (order.isEmpty()) {
            System.out.println("\nNo items ordered yet!");
            return;
        }
 
        double total = 0;
        for (Map.Entry<String, Integer> item : order.entrySet()) {
            total += menu.get(item.getKey()) * item.getValue();
        }
 
        System.out.print("Enter discount percentage (e.g., 10 for 10%): ");
        double discountPercent = sc.nextDouble();
        double discountAmount = total * (discountPercent / 100);
        double finalAmount = total - discountAmount;
 
        System.out.println("\n===== BILL WITH DISCOUNT =====");
        System.out.println("Original Total: ₹" + total);
        System.out.println("Discount (" + discountPercent + "%): -₹" + discountAmount);
        System.out.println("Final Amount: ₹" + finalAmount);
    }
}






public class demo1 {
    
}
