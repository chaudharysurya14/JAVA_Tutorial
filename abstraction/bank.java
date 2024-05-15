package abstraction;

import java.util.Scanner;
import java.util.prefs.BackingStoreException;

abstract class Bank {
    public String Name = "myBank";
    public String IFSC = "myBank123";

    public void bankDetail() {
        System.out.println("Bank_Name: " + Name + " " + "Bank_IFSC Code: " + IFSC);
    }

    abstract void Deposite();

    abstract void Withdraw();

    abstract void checkBal();

}

class bankService extends Bank {

    private double bal = 10000;
    private int pwd;
    public double money;

    public void bankDetail() {
        System.out.print("Bank_Name: " + Name + " " + "Bank_IFSC Code: " + IFSC);
    }

    public void Deposite() {
        System.out.print("Enter Password : ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();

        if (pwd == 123) {
            System.out.print("Enter Deposite Amount : ");
            money = s.nextDouble();
            bal = bal + money;
            System.out.println("Deposite money0" + money);
            System.out.println("Total Balence : " + bal);

        } else {
            System.out.println("Incorrect Password.");
        }
    }

    public void Withdraw() {
        System.out.print("Enter Password : ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();

        if (pwd == 123) {
            System.out.print("Enter Withdraw Amount : ");
            money = s.nextDouble();
            bal = bal - money;
            System.out.println("Withdraw money :" + money);
            System.out.println("Total Balence : " + bal);

        } else {
            System.out.println("Incorrect Password.");
        }
    }

    public void checkBal() {
        System.out.print("Enter Password : ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();

        if (pwd == 123) {
            System.out.println("Total Balence : " + bal);
        } else {
            System.out.print("Incorrect Password.");
        }
    }
}

class Customer {
    public static void main(String[] args) {
        bankService b = new bankService();
        b.bankDetail();
        int ch;
        System.out.print("1. Deposite.");
        System.out.print("1. Withdraw.");
        System.out.print("1. check Balence.");

        System.out.print("\n Enter Your Choice : ");
        Scanner s2 = new Scanner(System.in);
        ch = s2.nextInt();

        switch (ch) {
            case 1:
                b.Deposite();
                break;
            case 2:
                b.Withdraw();
                break;
            case 3:
                b.checkBal();
                break;
            default:
                System.out.print("Invalid Choice!");
        }
    }
}