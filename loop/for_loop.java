package loop;

import java.util.Scanner;

public class for_loop {
    public static void main (String[] args) {
        int num = 4;
        System.out.println ("Enter an number : ");
        // Scanner obj = new Scanner (System.in);
        // int num = obj.nextInt();
        for (int i = 1; i<=10; i++) {
            System.out.println(i+"th number is "+num*i);
        }
        // System.out.println(num*1);
        // System.out.println(num*2);
        // System.out.println(num*3);
        // System.out.println(num*4);
        // System.out.println(num*5);
    }
}