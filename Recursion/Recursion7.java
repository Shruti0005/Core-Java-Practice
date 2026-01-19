package Recursion;

import java.util.Scanner;

public class Recursion7 {
    public static int sumDigit(int n){
        //Base case
        if(n == 0){
            return 0;
        }

        //Recursive case
        return (n%10) + sumDigit(n/10);
    }
    public static void main(String[] args) {
        //Print sum of digit
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumDigit(num));
        sc.close();
    }
}
