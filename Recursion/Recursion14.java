package Recursion;

import java.util.Scanner;

public class Recursion14 {
    public static int power(int p, int n){
        //Base case
        if (p == 0) {
            return 1;
        }
        //Recursive call
        return n * power(p-1, n);
    }
    public static void main(String[] args) {
        //WAP to find power of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power");
        int p = sc.nextInt();
        System.out.println("Enter the value: ");
        int num = sc.nextInt();
        System.out.println(power(p, num));
        
        sc.close();
    }
}
