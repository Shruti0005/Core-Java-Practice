package Recursion;

import java.util.Scanner;

public class Recursion15 {
    public int sumDigit(int n){
        if (n == 0) {
            return 0;
        }
        return (n%10) + sumDigit(n/10);
    }
    public int productDigit(int n){
        if(n == 0) {
            return 1;
        }
        return (n%10) * productDigit(n/10);
    }
    public static void main(String[] args) {
        //WAP to check whether given number is a spy number or not?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Recursion15 r1 = new Recursion15();

        int sum = r1.sumDigit(num);
        int fact = r1.productDigit(num);
        
        if (sum == fact) {
            System.out.println("It's a Spy Number");
        }
        else{
            System.out.println("It's not a Spy Number");
        }
        sc.close();
    }
}
