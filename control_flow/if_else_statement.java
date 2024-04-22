import java.util.Scanner;
public class if_else_statement {
    public static void main (String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Your Password : ");
        int pwd = obj.nextInt();
        if (pwd == 6789) {
            System.out.println("this password is correct.");
        } 
        else {
            System.out.print("Please Enter correct Password.");
        }
    }
}