import java.util.Scanner;

public class nested_if_else {
    public static void main (String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1 = user_input.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = user_input.nextInt();
        System.out.print("Enter Third number: ");
        int num3 = user_input.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.print("Highest no is " + num1 );
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.print("Highest no is " + num2 );
        }
        else {
            System.out.print("highest Number is " + num3);
        }
    }
}
