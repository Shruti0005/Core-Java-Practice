package Recursion;

import java.util.Scanner;

public class Recursion21{
    public static void fabonacciSeries(int n, int a, int b){
        //Base case
        if (n == 0) {
            return;
        }

        System.out.println(a);
        //Recurssive call 
        fabonacciSeries(n-1, b, a+b);
    }
    public static void main(String[] args) {
        //print given fabonacci series 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;

        fabonacciSeries(num, a, b);
        sc.close();
    }
}
