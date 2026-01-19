package Recursion;

import java.util.Scanner;

public class Recursion11 {
    static int rev = 0; //Store the rebersed number
    //reverse method 
    public static int reverseDigit(int n){
        //Base case
        if (n == 0) {
            return rev;
        }
        
        int lastDigit = n % 10; //It will store last digit
        rev = rev * 10 + lastDigit;//It will reverse digit

        //Recursive call
        return reverseDigit(n/10);
    }
    public static void main(String[] args) {
        //Print reverse digit
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverseDigit(num));
        sc.close();
    }
}
