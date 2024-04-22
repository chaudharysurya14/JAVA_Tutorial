package loop;

import java.util.Scanner;

public class do_while {
    public static void main (String[] args){
        int i=1 , num;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a no for table : ");
        num = obj.nextInt();
        do {
            System.out.println (num*i);
            i++;
        }
        while (i <= 10);
    }
}