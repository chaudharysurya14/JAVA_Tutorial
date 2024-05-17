package Inheritance.Exception_handling;

public class Test {
    public static void main(String[] args) {

        System.out.println("Main method started.");
        int a = 10;
        int b = 0;
        int c;

        try {
            c = a / b; // c=10/0
            System.out.print(c);
        } catch (ArithmeticException e) {
            System.out.println("Can't devided by zero");
        }
        System.out.println("Main method ended");
    }

}
