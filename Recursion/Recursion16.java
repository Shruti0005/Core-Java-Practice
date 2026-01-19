package Recursion;

import java.util.Scanner;

public class Recursion16 {
    public static boolean prime(int n, int i){
        //Base case
        if (n <= 2) {
            return n == 2;
        }

        //Check all divisior 
        if (i == 1) {
            return true;
        }

        //Found factor
        if (n % i == 0) {
            return false;
        }

        //Recursive call
        return prime(n, i-1);
    }
    public static void main(String[] args) {
        //WAP to check a given number is prime or not 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("It's not a Prime Number");
        }
        else if (prime(num, num/2)) {
            System.out.println("It's a Prime Number");
        }
        else{
            System.out.println("It's not a Prime Number");
        }
        sc.close();
    }
}
