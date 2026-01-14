package Loops;

import java.util.Scanner;

public class SpyNum {
    public static void main(String[] args) {
        //WAP TO CHECK WHETHER GIVEN NUMBER IS A SPY NUMBER OR NOT ?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int product = 1;
        while (num > 0) {
            int rev = num % 10;
            sum = sum + rev;
            product = product * rev;
            num = num / 10;
        }
        if (sum == product) {
            System.out.println("It is Spy Number");
        }
        else{
            System.out.println("It is not a Spy Number");
        }
        sc.close();
    }
}
