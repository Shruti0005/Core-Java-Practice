package Recursion;

import java.util.Scanner;

public class Recursion2 {
    public static void printNumber(int n){
        //Base case
        if (n == 0) {
            return;
        }

        //print after recursion
        System.out.println(n);

        //recursive call
        printNumber(n-1);
    }
    public static void main(String[] args) {
        //Print number upto given number while decreasing 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printNumber(num);
        sc.close();
    }
}
