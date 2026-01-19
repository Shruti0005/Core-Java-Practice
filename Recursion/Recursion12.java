package Recursion;

import java.util.Scanner;

public class Recursion12 {
    static int rev = 0;
    public static int palin(int n) {
        //Base case
        if (n == 0) {
            return rev;
        }

        int lastDigit = n % 10;
        rev = rev * 10 + lastDigit;

        //Recursive call
        return palin(n/10);
    }
    public static void main(String[] args) {
        //Check given number is Palindrome or not
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == palin(num)) {
            System.out.println("It's a Palindrome");
        }
        else{
            System.out.println("It's not a Palindrom");
        }
        sc.close();
    }
}
