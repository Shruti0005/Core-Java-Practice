package Recursion;

import java.util.Scanner;

public class Recursion19 {
    //count digit
    public int countDigit(int n){
        if (n == 0) {
            return 0;
        }
        return 1 + countDigit(n/10);
    }
    //power
    public int power(int n, int i){
        if (i == 0) {
            return 1;
        }

        return n * power(n, i-1);
    }
    //sum of armstrong
    public int sumArmstrong(int n, int i){
        if (n == 0) {
            return 0;
        }

        int lastDigit = n % 10;
        return power(lastDigit, i) + sumArmstrong(n / 10, i);
    }
    public static void main(String[] args) {
        //check given number is a Armstrong Number
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Recursion19 r19 = new Recursion19();
        int count = r19.countDigit(num);
        int sum = r19.sumArmstrong(num, count);

        if (num == sum) {
            System.out.println("It's a Armstrong Number");
        }
        else{
            System.out.println("It's not a Armstrong Number");
        }
        sc.close();
    }
}
