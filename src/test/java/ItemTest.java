import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    @Test
    void testItemInitialization() {
        Item item = new Item(10.0, 2);
        assertEquals(10.0, item.getPrice(), 0.01);
        assertEquals(2, item.getQuantity());
    }

    @Test
    void testZeroPriceAndQuantity() {
        Item item = new Item(0.0, 0);
        assertEquals(0.0, item.getPrice(), 0.01);
        assertEquals(0, item.getQuantity());
    }

    @Test
    void testNegativePriceAndQuantity() {
        Item item = new Item(-5.0, -2);
        assertEquals(-5.0, item.getPrice(), 0.01);
        assertEquals(-2, item.getQuantity());
    }
}
