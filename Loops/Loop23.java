package Loops;

import java.util.Scanner;

public class Loop23 {
    public static void main(String[] args) {
        //WAP TO PRINT THE QUOTIENT OF THE NUMBER WITHOUT USING ANY DIVISION OPERATORS ?
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dividend");
        int m = sc.nextInt();
        System.out.println("Emter the Divisor");
        int n = sc.nextInt();
        int quotient = 0;
        if (n > 0) { 
            while (m >= n) {
                m = m - n;
                quotient++;
            }
            System.out.println("Quotient = "+quotient);
        }
        else{
            System.out.println("0 is not divisible");
        }
        
        sc.close();
    }
}
