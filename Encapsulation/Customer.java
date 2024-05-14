// package Encapsulation;

// import java.util.Scanner;

// class Bank {
//     private static double bal = 10000.00;
//     private static int pwd;

//     public void Deposite(double money) {
//         System.out.print("Enter Password : ");
//         Scanner s = new Scanner(System.in);
//         int pwd = s.nextInt();
//         if (pwd == 0010) {
//             bal = bal + money;
//             System.out.println("Deposit Money : " + money);
//             System.out.println("Total balance : " + bal);
//         } else {
//             System.out.println("Incorrect Password.");
//         }
//     }

//     public static void Withdraw(double money) {
//         System.out.print("Enter Password : ");
//         Scanner s = new Scanner(System.in);
//         int pwd = s.nextInt();
//         if (pwd == 0010) {
//             bal = bal - money;
//             System.out.println("Withdraw Money : " + money);
//             System.out.println("Total balance : " + bal);
//         } else {
//             System.out.println("Incorrect Password.");
//         }
//     }

//     public static void checkBalance() {
//         System.out.print("Enter Password : ");
//         Scanner s = new Scanner(System.in);
//         pwd = s.nextInt();
//         if (pwd == 0010) {
//             System.out.println("Total Balance: " + bal);
//         } else {
//             System.out.println("Incorrect Password");
//         }
//     }
// }

// public class Customer {
//     public static void main(String[] args) {
//         Bank b = new Bank();
//         int ch;

//         System.out.println("1. Deposit");
//         System.out.println("2. Withdraw");
//         System.out.println("3. Check Balance");

//         System.out.print("\nEnter your choice: ");
//         Scanner s2 = new Scanner(System.in);
//         ch = s2.nextInt();

//         switch (ch) {
//             case 1:
//                 System.out.print("Enter deposit amount: ");
//                 double depositAmount = s2.nextDouble();
//                 Bank.Deposite(depositAmount);
//                 break;
//             case 2:
//                 System.out.print("Enter withdrawal amount: ");
//                 double withdrawAmount = s2.nextDouble();
//                 Bank.Withdraw(withdrawAmount);
//                 break;
//             case 3:
//                 Bank.checkBalance();
//                 break;
//             default:
//                 System.out.println("Invalid Choice.");
//         }
//     }
// }
import java.util.Scanner;

class Deposite {
    public static void main(String[] args) {
        double bal = 10000;
        System.out.print("Enter Password : ");
        Scanner s = new Scanner(System.in);
        int pwd = s.nextInt();
        if (pwd == 0010) {
            System.out.print("Enter Amount : ");
            Scanner money = new Scanner(System.in);
            int m = money.nextInt();
            bal = bal + m;
            // System.out.println("Deposite Money : " + money);
            System.out.println("Total balence : " + bal);
        } else {
            System.out.println("Incorrect Password.");
        }
    }
}