package Recursion;

import java.util.Scanner;

public class Recursion4 {
    public static int factorial(int n){
        //Base case
        if (n == 0) {
            return 1;
        }

        //Recursive call
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        //print factorial of upto given number
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
        sc.close();
    }
}
