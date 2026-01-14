package Loops;

import java.util.Scanner;

public class Loop28 {
    public static void main(String[] args) {
        //WAP TO PRINT THE DIGITS IN HORIZONTALY ?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int p = 1;
        while (num > 0) {
            int res = num % 10;
            rev = res*p + rev;
            p = p * 10;
            num = num/10;
        }
        System.out.println(rev);
        sc.close();
    }
}
