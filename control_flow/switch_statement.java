import java.util.Scanner;

public class switch_statement {
    public static void main (String[] args) {
        Scanner onj = new Scanner(System.in);
        System.out.println("################## MENU #################");
        System.out.println("Enter your choice.");
        System.out.println("press '1' for print first day of week");
        System.out.println("press '2' for print second day of week");
        System.out.println("press '3' for print third day of week");
        System.out.println("press '4' for print forth day of week");
        System.out.println("press '5' for print fifth day of week");
        System.out.println("press '6' for print sixth day of week");
        System.out.println("press '7' for print seventh day of week");
        System.out.println("Enter 'exit' for exit.");
        System.out.println("###########################################");
        Scanner day_user_input =new Scanner(System.in);
        int day = onj.nextInt();
        switch  (day ) {
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thurasday");
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("Saturday");
            break;
            case 7 : System.out.println("Sunday");
            break;
            default : System.out.println("Please Enter valid input.");
        }
    }
}
