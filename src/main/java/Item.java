public class Item {
        private final double price;
        private final int quantity;

        public Item(double price, int quantity) {
            this.price = price;
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }
