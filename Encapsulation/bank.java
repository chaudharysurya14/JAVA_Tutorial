package Encapsulation;

import java.util.Scanner;

class bank {
    private double bal = 10000;
    private int pwd;

    public void Deposite(double money) {
        System.out.print("Enter Password : ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if (pwd == 0010) {
            System.out.print("Enter Amount : ");
            // Scanner locker1 = new Scanner(System.in);
            // int money = locker1.nextInt();
            bal = bal + money;
            System.out.println("Deposite Money : " + money);
            System.out.println("Total balence : " + bal);
        } else {
            System.out.println("Incorrect Password.");
        }
    }

    public void Withdraw(double money) {
        System.out.print("Enter Password : ");
        Scanner s = new Scanner(System.in);
        int pwd = s.nextInt();
        if (pwd == 0010) {
            bal = bal - money;
            System.out.println("Deposite Money : " + money);
            System.out.println("Total balence : " + bal);
        } else {
            System.out.println("Incorrect Password.");
        }
    }

    public void Check_Balence() {
        System.out.print("Enter Password : ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if (pwd == 0010) {
            System.out.print("Total Balence " + bal);
        } else {
            System.out.print("Incorrect Password");
        }
    }
}

class Customer {
    public static void main(String[] args) {

        Bank b = new Bank();

        int ch;
        System.out.println("1. Deposite: ");
        System.out.println("2. Withdraw: ");
        System.out.println("3. Check Balence: ");

        System.out.print("\n Enter your choice:");
        Scanner s2 = new Scanner(System.in);
        ch = s2.nextInt();

        switch (ch) {
            case 1:
                b.Deposite(56);
                break;
            case 2:
                b.Withdraw(68);
                break;
            case 3:
                b.Check_Balence();
                break;
            default:
                System.out.print("Invalid Choice.");
        }
    }
}