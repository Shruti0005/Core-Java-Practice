package Recursion;

import java.util.Scanner;

public class Recursion8 {
    public static int factorialDigit(int n){
        //Base case
        if(n == 0){
            return 1;
        }

        //Recursive call
        return (n%10) * factorialDigit(n/10);
    }
    public static void main(String[] args) {
        //Print factorial of digit
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorialDigit(num));
        sc.close();
    }
}
