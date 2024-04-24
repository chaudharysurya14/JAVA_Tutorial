package operator;

import java.util.Scanner;

public class arithmetic_ope {
    public static void main (String[] args) {
        System.out.println("============= MENU ============");
        System.out.println("press '1' for Addition.");
        System.out.println("press '2' for Subtraction.");
        System.out.println("press '3' for Multiplication.");
        System.out.println("press '4' for Devision.");
        System.out.println("=================================");
        System.out.print("Enter your choice : ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        switch (num) {
            case 1 : System.out.print("Enter first number : ");
            int a = obj.nextInt();
            System.out.print("Enter second number : ");
            int b = obj.nextInt();
            int c = a + b ;
            System.out.print("Addition of two no is " + c);
            break;
            case 2 : System.out.print("Enter first number : ");
            int d = obj.nextInt();
            System.out.print("Enter second number : ");
            int e = obj.nextInt();
            int f = d - e ;
            System.out.print("subtraction of two no is " + f);
            break;
            case 3 : System.out.print("Enter first number : ");
            int g = obj.nextInt();
            System.out.print("Enter second number : ");
            int h = obj.nextInt();
            int i = g * h ;
            System.out.print("Multiplication of two no is " + i);
            break;
            case 4 : System.out.print("Enter first number : ");
            int j = obj.nextInt();
            System.out.print("Enter second number : ");
            int k = obj.nextInt();
            int l = j / k ;
            System.out.print("Devision of two no is " + l);
            break;
            default : System.out.print("Enter valid input.");
        }
    }
}