package Recursion;

import java.util.Scanner;

public class Recursion5 {
    public static void printNum(int n){
        //Base case
        if (n == 0) {
            return;
        }
        //Recursive call
        printNum(n/10);

        System.out.println(n % 10); 
    }
    public static void main(String[] args) {
        //print digit vertically
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printNum(num);
        sc.close();
    }
}
