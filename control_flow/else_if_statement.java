import java.util.Scanner;

public class else_if_statement {
    public static void main (String[] args) {
        System.out.print("Enter student marks in percentage : ");
        Scanner marks_store = new Scanner(System.in);
        int student_mark = marks_store.nextInt();
        if (student_mark <= 29 ) {
            System.out.print("fail.");
        }
        else if (student_mark >= 30 && student_mark <= 44) {
            System.out.print("Third DIvision.");
        }
        else if (student_mark >= 45 && student_mark <= 59) {
            System.out.print("Second DIvision.");
        }
        else if (student_mark >= 60 && student_mark <= 100) {
            System.out.print("First DIvision.");
        }
        else {
            System.out.print("Enter valid Input.");
        }
    }
}
