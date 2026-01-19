package Recursion;

import java.util.Scanner;

public class Recursion9 {
    public static int countDigit(int n){
        //Base case
        if (n == 0) {
            return 0;
        }
        //Recursive call 
        return 1 + countDigit(n/10);
    }
    public static void main(String[] args) {
        //print count of digit
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(countDigit(num));
        sc.close();
    }
}
