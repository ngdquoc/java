package day11;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog("Milo");
        animal.speak();
    }
}

class Animal {
    protected final String name;
    Animal(String name) { this.name = name; }
    void speak() { System.out.println(name + " phát ra âm thanh"); }
}

class Dog extends Animal {
    Dog(String name) { super(name); }
    @Override void speak() { System.out.println(name + ": gâu gâu!"); }
}
