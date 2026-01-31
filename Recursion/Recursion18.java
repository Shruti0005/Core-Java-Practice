package Recursion;

import java.util.Scanner;

public class Recursion18 {
    public static boolean perfectSquare(int n, int i){
        //Base case
        if (i == 0) {
            return false;
        }

        if (i * i == n) {
            return true;
        }
        //Recursive call
        return perfectSquare(n, i-1);
    }
    public static void main(String[] args) {
        //Check if given number is pefect squre number or not
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = num/2;

        if (perfectSquare(num, i)) {
            System.out.println("It's a pefect squre");
        }
        else{
            System.out.println("It's not a perfect number");
        }

        sc.close();
    }
}
