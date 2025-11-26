class OnlineOrder {

    private String itemName;
    private int quantity;
    private double pricePerItem;

    // Default Constructor
    OnlineOrder() {
        this("Unknown Item", 1, 0.0); // Constructor Chaining
    }

    // Parameterized Constructor
    OnlineOrder(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerItem = price;
    }

    double calculateTotal() {
        double total = quantity * pricePerItem;
        double tax = total * 0.18; // 18% GST
        return total + tax;
    }

    void display() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Item: ₹" + pricePerItem);
        System.out.println("Final Amount (with GST): ₹" + calculateTotal());
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        OnlineOrder o1 = new OnlineOrder();
        OnlineOrder o2 = new OnlineOrder("Wireless Mouse", 2, 799);

        o1.display();
        o2.display();
    }
}
