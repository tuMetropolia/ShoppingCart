import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Select language
        System.out.println("Select language / Välj språk / Valitse kieli: \n1. Suomi \n2. 日本語 \n3. Svenska \n4. English");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Locale locale;
        switch (choice) {
            case 1:
                locale = new Locale("fi", "FI");
                break;
            case 2:
                locale = new Locale("ja", "JP");
                break;
            case 3:
                locale = new Locale("sv", "SE");
                break;
            default:
                locale = new Locale("en", "US");
        }

        ResourceBundle messages = ResourceBundle.getBundle("messages", locale);

        System.out.println(messages.getString("enter_items"));
        int numItems = scanner.nextInt();

        List<Item> items = new ArrayList<>();
        for (int i = 1; i <= numItems; i++) {
            System.out.println(messages.getString("enter_price") + " " + i + ":");
            double price = scanner.nextDouble();

            System.out.println(messages.getString("enter_quantity") + " " + i + ":");
            int quantity = scanner.nextInt();

            items.add(new Item(price, quantity));
        }

        double totalCost = ShoppingCart.calculateTotalCost(items);
        System.out.println(messages.getString("total_cost") + " " + totalCost);
        scanner.close();
    }
}
