import java.util.Scanner;
// package menu_driven;

public class if_else_driven {
    public static void main(String[] args) {
        System.out.println("################## MENU #################");
        System.out.println("Enter your choice.");
        System.out.println("press '1' for print first day of week");
        System.out.println("press '2' for print second day of week");
        System.out.println("press '3' for print third day of week");
        System.out.println("press '4' for print forth day of week");
        System.out.println("press '5' for print fifth day of week");
        System.out.println("press '6' for print sixth day of week");
        System.out.println("press '7' for print seventh day of week");
        System.out.println("###########################################");
        Scanner day_user_input =new Scanner(System.in);
        int day = day_user_input.nextInt();
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
}

// import java.util.Scanner;

// public class if_else_driven {
//     public static void main(String[] args) {
//         System.out.println("Enter your choice:");
//         System.out.println("Press '1' to print the first day of the week");
//         System.out.println("Press '2' to print the second day of the week");
//         System.out.println("Press '3' to print the third day of the week");
//         System.out.println("Press '4' to print the fourth day of the week");
//         System.out.println("Press '5' to print the fifth day of the week");
//         System.out.println("Press '6' to print the sixth day of the week");
//         System.out.println("Press '7' to print the seventh day of the week");

//         Scanner day_user_input = new Scanner(System.in);
//         int day = day_user_input.nextInt();

//         if (day == 1) {
//             System.out.println("Monday");
//         } else if (day == 2) {
//             System.out.println("Tuesday");
//         } else if (day == 3) {
//             System.out.println("Wednesday");
//         } else if (day == 4) {
//             System.out.println("Thursday");
//         } else if (day == 5) {
//             System.out.println("Friday");
//         } else if (day == 6) {
//             System.out.println("Saturday");
//         } else if (day == 7) {
//             System.out.println("Sunday");
//         } else {
//             System.out.println("Please Enter a valid input.");
//         }
//     }
// }

// import java.util.Scanner;

// public class WeekdayMenu {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.println("Menu:");
//         System.out.println("1. Monday");
//         System.out.println("2. Tuesday");
//         System.out.println("3. Wednesday");
//         System.out.println("4. Thursday");
//         System.out.println("5. Friday");
//         System.out.println("6. Saturday");
//         System.out.println("7. Sunday");
//         System.out.println("Enter your choice (1-7): ");

//         int choice = scanner.nextInt();

//         if (choice >= 1 && choice <= 7) {
//             String day;
//             switch (choice) {
//                 case 1:
//                     day = "Monday";
//                     break;
//                 case 2:
//                     day = "Tuesday";
//                     break;
//                 case 3:
//                     day = "Wednesday";
//                     break;
//                 case 4:
//                     day = "Thursday";
//                     break;
//                 case 5:
//                     day = "Friday";
//                     break;
//                 case 6:
//                     day = "Saturday";
//                     break;
//                 case 7:
//                     day = "Sunday";
//                     break;
//                 default:
//                     day = "Invalid choice";
//                     break;
//             }
//             System.out.println("You chose: " + day);
//         } else {
//             System.out.println("Invalid choice! Please enter a number between 1 and 7.");
//         }

//         scanner.close();
//     }
// }
