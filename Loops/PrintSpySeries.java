package Loops;

import java.util.Scanner;

public class PrintSpySeries {
    public static void main(String[] args) {
        //WAP TO PRINT SPY NUMBERS BEWEEN M AND N ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            int temp = i;
            int sum = 0;
            int product = 1;
            while (temp > 0) {
                int rev = temp % 10;
                product = product * rev;
                sum = sum + rev;
                temp = temp / 10;
            }
            if (product == sum) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
