// import java.util.Scanner;
// // package accept_value_from_user;

// public class first {
//     public static void main (String[] args) {
//         Scanner user_input = new Scanner(System.in);
//         System.out.println("Enter your Input : ");
//         int a = user_input.nextInt();
//         System.out.println("Your Input is : " + a);
//     }
// }

import java.util.Scanner;

public class AcceptInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your input: ");
        int a = userInput.nextInt();
        System.out.println("Your input is: " + a);
        userInput.close(); // Closing the Scanner
    }
}
