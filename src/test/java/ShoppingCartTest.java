import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    @Test
    void testCalculateTotalCost() {
        // Test case 1: Normal values
        List<Item> items1 = Arrays.asList(new Item(10.0, 2), new Item(5.0, 3));
        assertEquals(35.0, ShoppingCart.calculateTotalCost(items1), 0.01);

        // Test case 2: Single item
        List<Item> items2 = Arrays.asList(new Item(20.0, 1));
        assertEquals(20.0, ShoppingCart.calculateTotalCost(items2), 0.01);

        // Test case 3: No items
        List<Item> items3 = Arrays.asList();
        assertEquals(0.0, ShoppingCart.calculateTotalCost(items3), 0.01);

        // Test case 4: Zero quantity
        List<Item> items4 = Arrays.asList(new Item(15.0, 0));
        assertEquals(0.0, ShoppingCart.calculateTotalCost(items4), 0.01);

        // Test case 5: Zero price
        List<Item> items5 = Arrays.asList(new Item(0.0, 5));
        assertEquals(0.0, ShoppingCart.calculateTotalCost(items5), 0.01);
    }
}
