// package person;

public class person {
    int age = 24;
    int weight = 65;
    String colour = "Black Asian";

    void eat() {
        System.out.println("I love chana ka halwa.");
    }

    void sleep() {
        System.out.println("I love to sleep in late night.");
    }

    void play() {
        System.out.println("I love to play BGMI.");
    }

    public static void main(String[] args) {
        person p = new person();
        System.out.println(p.age);
        System.out.println(p.colour);
        System.out.println(p.weight);

        p.sleep();
        p.play();
        p.eat();

    }
}
