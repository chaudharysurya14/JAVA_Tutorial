package Array;

import java.util.Scanner;

public class d1_code3 {
    public static void main(String args[]) {
        System.out.println("Enter array Element : ");
        int a[] = new int[5]; // creating empty index for 5 array elemrnt
        Scanner obj = new Scanner(System.in); // This line of code is take input from user for array
        for (int i = 0; i < 5; i++) { // This line of code is take input from user for array
            a[i] = obj.nextInt(); // This line of code is take input from user for array
        }
        System.out.println("Array elements are : "); // This line of code is print array elements
        for (int b : a) { // This line of code is print array elements
            System.out.println(b); // This line of code is print array elements
        }
    }
}
