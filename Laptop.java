
class Laptop {
    private String brand;
    private int ram;
    private double price;

    // Constructor
    Laptop(String b, int r, double p) {
        brand = b;
        ram = r;
        price = p;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setPrice(double newPrice) {
        price = newPrice;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Laptop l = new Laptop("HP", 16, 65000);
        l.display();

        l.setPrice(62000);
        System.out.println("\nAfter Price Update:");
        l.display();
    }
}
