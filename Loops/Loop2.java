package Loops;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        //WAP TO PRINT 1 TO N NATURAL NUMBERS ?
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
