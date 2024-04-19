import java.util.Scanner;

public class if_else {
    public static void main(String[] args){
        Scanner Voter_information = new Scanner(System.in);
        System.out.print("Enter the Age of candidate : ");
        float age = Voter_information.nextFloat();
        if (age > 21) {
            System.out.println("The candidate is eligible for give vote.");
        }
        else if (age == 21) {
            System.out.println("As for now you go, I'll discuss about it and inform you.");
        }
        else {
            System.out.println("The candidate is not eligible for the vote.");
        }
    }
}