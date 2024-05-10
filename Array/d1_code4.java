// This code is decorate in assending order of all the element that i accept by the users in array
package Array;

// import java.util.array;
import java.util.Scanner;

public class d1_code4 {
    public static void main(String[] args) {
        int a[] = new int[5]; // Creating new empty array index
        System.out.print("Enter Array element : ");
        Scanner obj = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = obj.nextInt();
        }
        // Arrays.sort(a);
        System.out.print("Your elements are : ");
        for (int b : a) {
            System.out.println(b);
        }
    }
}
