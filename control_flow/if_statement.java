import java.util.Scanner;

public class if_statement {
    public static void main (String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Your Password : ");
        int pwd = obj.nextInt();
        if (pwd == 6789) {
            System.out.println("this password is correct.");
        } 
    }
}