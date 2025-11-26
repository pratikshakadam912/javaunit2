
class Vehicle {
    String name;
    int speed;

    static String company = "Honda"; // Static variable shared

    final int wheels; // Must be initialized once

    // Default Constructor
    Vehicle() {
        name = "Unknown";
        speed = 0;
        wheels = 2;
    }

    // Overloaded Constructor
    Vehicle(String n, int s, int w) {
        name = n;
        speed = s;
        wheels = w;
    }

    void display() {
        System.out.println("Vehicle: " + name);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Wheels: " + wheels);
        System.out.println("Company: " + company);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Activa", 50, 2);

        v1.display();
        v2.display();
    }
}
