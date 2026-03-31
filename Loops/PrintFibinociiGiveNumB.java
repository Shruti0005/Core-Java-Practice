package Loops;

import java.util.Scanner;

public class PrintFibinociiGiveNumB {
    public static void main(String[] args) {
        //Print Fibonacci numbers between 10 and 100
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for start: ");
        int start = sc.nextInt();
        System.out.println("Enter the value for end: ");
        int end = sc.nextInt();

        int a = 0;
        int b = 1;
        int sum;
        while (a <= end) {
            if (a >= start) {
                System.out.println(a);
            }
            sum = a + b;
            a = b;
            b = sum;
        }
        sc.close();
    }
}
