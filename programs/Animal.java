// Program 1: Demonstrating inheritance with protected + public access
class Animal {
    protected String type = "Mammal"; // Accessible to subclasses
    public String sound = "Generic Sound";

    protected void showType() {
        System.out.println("Animal Type: " + type);
    }

    public void makeSound() {
        System.out.println("Animal Sound: " + sound);
    }
}

class Dog extends Animal {
    public void showDog() {
        System.out.println("Dog inherits type: " + type);
        showType();
        System.out.println("Dog Sound: Bark Bark!");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.showDog();
        d.makeSound();
    }
}
