import java.util.Scanner;

public class continue_statement {
    public static void main (String[] args) {
        int i=1, num;
        System.out.print("Enter a number : ");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        for (; i <= 10; i++) {
            if (i ==5)
            continue;
            System.out.println(num*i);
        }
    }
}
