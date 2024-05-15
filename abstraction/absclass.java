abstract class Animal {
    void legs() {
        System.out.println("All animals have four legs.");
    }

    abstract void sound();

    abstract void eat();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bhow Bhow....");
    }

    void eat() {
        System.out.println("Meat eating.");
    }
}

class Cow extends Animal {
    void sound() {
        System.out.println("Oooo Ooooo....");
    }

    void eat() {
        System.out.println("Grass eating.");
    }
}

public class AbsClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cow c = new Cow();

        d.sound();
        d.eat();
        d.legs();

        c.sound();
        c.eat();
        c.legs();
    }
}
