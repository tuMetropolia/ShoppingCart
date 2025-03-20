import java.util.*;
import java.util.Locale;
import java.util.ResourceBundle;


    public class ShoppingCart {
        public static double calculateTotalCost(List<Item> items) {
            double totalCost = 0;
            for (Item item : items) {
                totalCost += item.getPrice() * item.getQuantity();
            }
            return totalCost;
        }
    }

