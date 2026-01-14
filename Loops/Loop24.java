package Loops;

import java.util.Scanner;

public class Loop24 {
    public static void main(String[] args) {
        //WAP TO PRINT THE REMAINDER OF THE NUMBER WITHOUT USING ANY DIVISION OPERATORS ?
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend");
        int m = sc.nextInt();
        System.out.println("Enter the divisor");
        int n = sc.nextInt();
        if (n > 0) {
            while (m >= n) {
                m = m - n;
            }
            System.out.println("Riminder = "+m);
        }
        else{
            System.out.println("0 is not divisble");
        }

        sc.close();
    }
}
