
class Mobile {

    // Instance Variables
    String brand;
    String color;
    int ram;

    // Static Variable (shared by all)
    static String operatingSystem = "Android";

    // Default Constructor
    Mobile() {
        brand = "Unknown";
        color = "Black";
        ram = 4;
    }

    // Parameterized Constructor
    Mobile(String b, String c, int r) {
        brand = b;
        color = c;
        ram = r;
    }

    // Method to show mobile info
    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("OS: " + operatingSystem);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Samsung", "Blue", 8);

        m1.showDetails();
        m2.showDetails();
    }
}
