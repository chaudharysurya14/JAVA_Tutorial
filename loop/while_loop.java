import java.util.Scanner;
// package loop;

public class while_loop {
    public static void main (String args[]) {
        int num;
        int i = 1;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a no for table : ");
        num = obj.nextInt();

        while (i <= 10) {
            System.out.print (num*i);
            i++;
        }
    }
}
