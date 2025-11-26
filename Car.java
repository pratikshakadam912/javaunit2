// Program 1: Car class demonstrating OOP concepts
class Car {

    // Instance Variables
    String brand;
    String model;
    double price;

    // Static Variable (common to all cars)
    static String manufacturer = "TATA Motors";

    // Default Constructor
    Car() {
        brand = "Unknown";
        model = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    Car(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    // Method to display details
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Tata", "Nexon EV", 1500000);

        c1.display();
        c2.display();
    }
}
