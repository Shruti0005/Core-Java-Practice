package Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //WAP TO CHECK WHETHER GIVEN NUMBER IS PALINDROME OR NO ?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while (num > 0) {
            int res = num % 10;
            rev = rev * 10 + res;
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println(temp + " is a Palindrome");
        }
        else{
            System.out.println(temp + " is not a Palindrome");
        }
        sc.close();
    }
}
