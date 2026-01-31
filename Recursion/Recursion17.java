package Recursion;

import java.util.Scanner;

public class Recursion17 {
    public static int perfectNumber(int n, int i){
        //Base case
        if (i == 0) {
            return 0;
        }
        if (n % i == 0) {
            return i + perfectNumber(n, i-1);
        }
        //Recurssive call
        return perfectNumber(n, i-1);
    }
    public static void main(String[] args) {
        //Check if given number perfect number not
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = num/2;

        int perfNum = perfectNumber(num, i);
        if (perfNum == num) {
            System.out.println("It's a Perfect Number");
        }
        else{
            System.out.println("It's not a Perfect Number");
        }
        sc.close();
    }
}
