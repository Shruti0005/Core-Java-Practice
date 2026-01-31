package Recursion;

import java.util.Scanner;

public class Recursion20 {
    //factorial of digits
    public int factDigit(int n){
        if (n == 0) {
            return 1;
        }
        return n * factDigit(n-1);
    }
    //sum of factorial
    public int sumStrong(int n){
        if (n == 0) {
            return 0;
        }

        int lastDigit = n % 10;
        return factDigit(lastDigit) + sumStrong(n/10);
    }
    public static void main(String[] args) {
        //Check if given number is a strong number or not
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Recursion20 r2 = new Recursion20();
        int sum = r2.sumStrong(num);

        if (sum == num) {
            System.out.println("It's a Strong Number");
        }
        else{
            System.out.println("It's not a Strong Number");
        }

        sc.close();
    }
}
