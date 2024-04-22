import java.util.Scanner;

public class break_statement {
    public static void main (String[] args) {
        int i=1, num=10;
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        for (; i <= 10; i++) {
            System.out.println(num*i);
            if (i ==5)
                break;
        }
    }
}
