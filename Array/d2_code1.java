package Array;

import java.util.Scanner;

public class d2_code1 {
    public static void main(String[] args) {
        System.out.print("Enter Matrix Elements : ");
        Scanner obj = new Scanner(System.in);

        // Now creating empty matrix element of 2/2
        int a[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = obj.nextInt();
            }
        }
        System.out.print("Matrix Elemennts : \n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
