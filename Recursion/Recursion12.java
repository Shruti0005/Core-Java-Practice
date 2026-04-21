package Recursion;

import java.util.Scanner;

public class Recursion12 {
    public static int palin(int n, int rev) {
        //Base case
        if (n == 0) {
            return rev;
        }

        //Recursive call
        return palin(n/10, rev * 10 + (n % 10));
    }
    public static void main(String[] args) {
        //Check given number is Palindrome or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int num = sc.nextInt();
        if (num == palin(num, 0)) {
            System.out.println("It's a Palindrome");
        }
        else{
            System.out.println("It's not a Palindrom");
        }
        sc.close();
    }
}
