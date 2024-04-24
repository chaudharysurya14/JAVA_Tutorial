import java.util.Scanner;

public class do_while_driven {
    public static void main (String[] args) {
        int day;
        Scanner day_user_input =new Scanner(System.in);

        do {            
            System.out.println("################## MENU #################");
            System.out.println("press '1' for print first day of week");
            System.out.println("press '2' for print second day of week");
            System.out.println("press '3' for print third day of week");
            System.out.println("press '4' for print forth day of week");
            System.out.println("press '5' for print fifth day of week");
            System.out.println("press '6' for print sixth day of week");
            System.out.println("press '7' for print seventh day of week");
            System.out.println("###########################################");


            System.out.print("Enter your choice : ");
            day = day_user_input.nextInt();


            if (day == 1) {
                System.out.println("Monday");
            }
            else if (day == 2) {
                System.out.println("Tuesday");
            }
            else if (day == 3) {
                System.out.println("Wednesday");
            }
            else if (day == 4) {
                System.out.println("Thurasday");
            }
            else if (day == 5) {
                System.out.println("Friday");
            }
            else if (day == 6) {
                System.out.println("Saturday");
            }
            else if (day == 7) {
                System.out.println("Sunday");
            }
            else {
                System.out.println("Please Enter valid input.");
            }
        }
        while (day == 9);
    }
}
