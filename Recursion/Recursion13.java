package Recursion;

import java.util.Scanner;

public class Recursion13 {
    public static void table(int n, int t){
        //Base case
        if (n == 0) {
            return;
        }

        //Recursive call
        table(n-1, t);
        System.out.println(n * t);
    }
    public static void main(String[] args) {
        //Print multiplication table
        Scanner sc = new Scanner(System.in);
        int num = 10;
        int tab = sc.nextInt();
        table(num, tab);
        sc.close();
    }
}
