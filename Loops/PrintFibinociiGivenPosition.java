package Loops;

import java.util.Scanner;

public class PrintFibinociiGivenPosition {
    public static void main(String[] args) {
        //WAP TO PRINT FIBINOCII SERIES BY READING THE VALUE ?
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the postion: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        
        if (n == 1) {
            System.out.println(0);
        }
        else if (n == 2) {
            System.out.println(1);
        }
        else{
            int sum;
            for (int i = 3; i <= n; i++) {
                sum = a + b;
                a = b;
                b = sum;
            }
            System.out.println(b);
        }
        sc.close();
    }
}
