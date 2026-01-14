package Loops;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        //WAP TO CHECK WHETHER GIVEN NUMBER IS A PERFECT NUMBER OR NOT ?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <=num/2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("It is not a perfect number");
        }
        sc.close();
    }
}
